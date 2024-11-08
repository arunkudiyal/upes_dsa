import java.util.Arrays;

public class DijkstraAlgorithm {
    int V; int[][] graph;
    DijkstraAlgorithm(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public int minVertex(boolean[] visited, int[] cost) {
        int minVetex = -1; int minCost = Integer.MAX_VALUE;
        for(int i=0 ; i < V; i++) {
            if(cost[i] < minCost && !visited[i]) {
                minVetex = i;
                minCost = cost[i];
            }
        }
        return minVetex;
    }
    public void dijkstra(int[][] graph, int start) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        int[] cost = new int[V];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[start] = graph[start][start];
        for(int i=0; i < V-1; i++) {
            int u = minVertex(visited, cost);               // u --> source
            visited[u] = true;
            for(int v=0; v < V; v++) {                      // v --> destination
                // edge b/w u to v, !visited[v], graph[u][v] <= cost[v]
                if(graph[u][v] != 0 && !visited[v] && cost[v] > cost[u] + graph[u][v]) {
                    cost[v] = cost[u] + graph[u][v];
                }
            }
        }
        for(int i=0; i < V; i++) System.out.print(cost[i] + " ");
    }
    public static void main(String[] args) {
        int V = 9;
        DijkstraAlgorithm da = new DijkstraAlgorithm(V);
        da.graph = new int[][] {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        da.dijkstra(da.graph, 0);
    }
}
