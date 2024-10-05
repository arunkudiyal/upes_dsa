public class Recursion {
    public static int fib(int term) {
        if(term < 1) return -1;
        if(term == 1) return 0;
        if(term == 2) return 1;
        return fib(term - 1) + fib(term - 2 );
    }

    // Q:- n (rows) x m (cols) grid, start = top left of the grid; end = bottom right of the grid
    // directions :- downward or rightward, not possible :- backward or upward
    // return the total no of ways to travel the grid
    public static int gridTraveller(int n, int m) {
        if(m < 0 || n < 0) return -1;
        if(m == 0 || n == 0) return 0;
        if(m == 1 && n == 1) return 1;
        // noOfWays(downward) + noOfWays(rightward)
        return gridTraveller(n-1, m)  + gridTraveller(n, m-1);
    }

    // Q:- given with a set of distinct & positive "nums[]", and target = number
    // boolean canSum(int[] arr, int target), true if target could be found by the sum of any nos of nums
    // NOTE:- use any no of nums[] any time for any frequency.
    // Example:- arr: [2, 4, 6]; target = 99 -> false
    // Example:- arr: [2, 4, 6]; target = 100 -> true
    public static boolean canSum(int[] arr, int target) {
        if(target == 0) return true;
        if(target < 0) return false;
        for(int i=0 ; i < arr.length; i++) {
            int remainder = target - arr[i];
            return  canSum(arr, remainder);
        }
        return false;
    }
    public static void main(String[] args) {
        // System.out.println( fib(50) );                            // 12586269024
        System.out.println( gridTraveller(3, 3) );              // 6
        int[] arr = {6, 3, 7};
        System.out.println( canSum(arr, 100) );                 // true
        System.out.println( canSum(arr, 99) );                  // false
    }
}
