import java.util.HashMap;
import java.util.Map;

public class Knapsack01 {
    public int knapsack(int N, int[] weights, int[] values, int W) {
        Map<String, Integer> memo = new HashMap<>();
        return knapsackUtil(N, weights, values, W, memo);
    }
    public int knapsackUtil(int N, int[] weights, int[] values, int W, Map<String, Integer> memo) {
        String key = N + "," + W;
        if(memo.containsKey(key)) return memo.get(key);
            if(W == 0 || N == 0) {
                memo.put(key, 0);
                return 0;
            }
            if(W-weights[N-1] < 0) {
                int ans = knapsackUtil(N - 1, weights, values, W, memo);
                memo.put(key, ans);
                return ans;
            }
            else {
                int ans = Math.max(values[N - 1] + knapsackUtil(N - 1, weights, values, W - weights[N - 1], memo),
                        knapsackUtil(N - 1, weights, values, W, memo));
                memo.put(key, ans);
                return ans;
            }
    }
    public static void main(String[] args) {
        Knapsack01 knapsack01 = new Knapsack01();
        int N = 1000;
        int[] values = new int[N];
        int[] weights = new int[N];
        int W = 1000;
        int ans = knapsack01.knapsack(N, weights, values, W);
        System.out.println(ans);                                        // 180
    }
}
