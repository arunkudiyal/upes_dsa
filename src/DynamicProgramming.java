import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {
    public long fibonacci(int N) {
        long[] memo = new long[N+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;
        return fibonacciUtil(N, memo);
    }
    public long fibonacciUtil(int N, long[] memo) {
        if(memo[N] != -1) return memo[N];
        if(N == 0) return memo[0];
        if(N == 1) return memo[1];
        memo[N] = fibonacciUtil(N-2, memo) + fibonacciUtil(N-1, memo);
        return memo[N];
    }
    public int fibTabular(int N) {
        int[] table = new int[N+1];
        table[0] = 0;
        table[1] = 1;
        for(int i=2; i <= N; i++) table[i] = table[i-2] + table[i-1];
        for(int i=0; i <= N ; i++) System.out.print(table[i] + " ");
        System.out.println();
        return table[N];
    }
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fib(N-2) + fib(N-1);
    }
    public int gridTraveller(int n, int m) {
        if(m < 0 || n < 0) return -1;
        if(m == 0 || n == 0) return 0;
        if(m == 1 && n == 1) return 1;
        return gridTraveller(n-1, m)  + gridTraveller(n, m-1);
    }
    public int gridTravellerMemo(int N, int M) {
        String key = N + "," + M;
        System.out.println(key);
        Map<String, Integer> memo = new HashMap<>();
        if(M == 0 || N == 0) return 0;
        memo.put("1,1", 1);
        System.out.println(memo);
        return gridTravellerMemoUtil(N, M, memo);
    }
    public int gridTravellerMemoUtil(int N, int M, Map<String, Integer> memo) {
        String key = N + "," + M;
        if(memo.containsKey(key)) return memo.get(key);
        if(M == 0 || N == 0) return 0;
        if(M == 1 && N == 1) return memo.get("1,1");
        Integer solution = gridTravellerMemoUtil(N-1, M, memo)
                + gridTravellerMemoUtil(N, M-1, memo);
        memo.put(key, solution);
        System.out.println(memo);
        return memo.get(key);
    }
    public boolean canSum(int targetSum, int[] arr) {
        if(targetSum == 0) return true;
        if(targetSum < 0) return false;
        for(int num: arr) {
            int remainder = targetSum - num;
            if(canSum(remainder, arr)) return true;
        }
        return false;
    }
    public boolean canSumMemo(int targetSum, int[] arr) {
        Map<Integer, Boolean> memo = new HashMap<>();
        memo.put(0, true);
        return canSumMemoUtil(targetSum, arr, memo);
    }
    public boolean canSumMemoUtil(int targetSum, int[] arr, Map<Integer, Boolean> memo) {
        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) memo.get(0);
        if(targetSum < 0) return false;
        for(int num: arr) {
            int remainder = targetSum - num;
            if(canSumMemoUtil(remainder, arr, memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }
    public boolean canSumTabular(int targetSum, int[] arr) {
        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;
        for (int i = 0; i <= targetSum; i++) {     // i=0
            for (int j = 0; j < arr.length; j++) { // j=0..3
                if (table[i]) if (i + arr[j] <= targetSum) table[i + arr[j]] = true;
            }
        }
        for(boolean val: table) System.out.print(val+ " ");
        System.out.println();
        return table[targetSum];
    }
    public static void main(String[] args) {
        DynamicProgramming DP = new DynamicProgramming();
        System.out.println(DP.fibonacci(50));
        System.out.println(DP.fibTabular(8));

        System.out.println(DP.gridTravellerMemo(3, 3));
        int[] arr = {2, 4, 6, 8};
        // System.out.println(DP.canSumMemo(10001, arr));              // false
        System.out.println(DP.canSumTabular(11, arr));
    }
}
