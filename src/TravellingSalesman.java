public class TravellingSalesman {
    int V; int[][] matrix;
    TravellingSalesman(int V, int[][] matrix) {
        this.V = V;
        this.matrix = matrix;
    }
    public int tsp(int n, int[][] graph) {
        boolean[] v = new boolean[V];
        v[0] = true;
        int ans = Integer.MAX_VALUE;
        // Find out the most min cost hamilton cycle
        return tspUtil(graph, v, 0, n, 1, 0, ans);
    }
    public int tspUtil(int[][] graph, boolean[] v, int currPos, int n, int count, int cost, int ans) {
        if(count == n && graph[currPos][0] > 0) {
            ans = Math.min(ans, cost + graph[currPos][0]);
            return ans;
        }
        for(int i=0; i < n; i++) {
            if(!v[i] && graph[currPos][i] > 0) {
                v[i] = true;
                ans = tspUtil(graph, v, i, n, count+1, cost + graph[currPos][i], ans);
                v[i] = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int V = 4;
        int[][] matrix = {
                {0, 10, 15, 20},
                {5, 0, 25, 10},
                {15, 30, 0, 5},
                {15, 10, 20, 0}
        };
        TravellingSalesman travellingSalesman = new TravellingSalesman(V, matrix);
        System.out.println(travellingSalesman.tsp(V, matrix));                          // 35
    }
}