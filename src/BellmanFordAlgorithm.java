import java.util.Arrays;

public class BellmanFordAlgorithm {
    int V; int[][] graph;
    public BellmanFordAlgorithm(int vertices, int[][] graph) {
        this.V = vertices;
        this.graph = graph;
    }
    public boolean bellmanFordAlgorithm(int source) {
        int[] cost = new int[V];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[source] = 0;
        for(int i=0; i < V-1; i++) {
            for(int u=0; u < V; u++) {
                for(int v=0; v < V; v++) {
                    if(graph[u][v] != Integer.MAX_VALUE && cost[u] != Integer.MAX_VALUE &&
                            cost[v] > cost[u] + graph[u][v]) {
                        cost[v] = cost[u] + graph[u][v];
                    }
                }
            }
        }
        // looking for a -ve weight cycle!
        for(int u=0; u < V; u++) {
            for(int v=0; v < V; v++) {
                if(graph[u][v] != Integer.MAX_VALUE && cost[u] != Integer.MAX_VALUE &&
                        cost[v] > cost[u] + graph[u][v]) {
                    System.out.println("Graph contains a -ve weight cycle!");
                    return true;
                }
            }
        }
        for(int i=0 ; i < V; i++) System.out.print(cost[i] + " ");
        System.out.println();
        return false;
    }
    public static void main(String[] args) {
        int vertices = 5;
        int[][] graph = {
                {0, -1, 4, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, 3, 2, 2},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 1, 5, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -3, 0}

                /* {Integer.MAX_VALUE, Integer.MAX_VALUE, 3},
                {2, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, -10, Integer.MAX_VALUE} */
        };
        BellmanFordAlgorithm bellmanFord = new BellmanFordAlgorithm(vertices, graph);
        int source = 0;
        bellmanFord.bellmanFordAlgorithm(source);
    }
}
