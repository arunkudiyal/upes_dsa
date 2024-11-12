public class FloydWarshallAlgorithm {
    static int INF = Integer.MAX_VALUE;
    int V; int[][] graph;
    public FloydWarshallAlgorithm(int vertices, int[][] graph) {
        this.V = vertices;
        this.graph = graph;
    }
    public void floydWarshall() {
        int[][] cost = new int[V][V];
        for(int i=0 ; i < V; i++) {
            for(int j=0; j < V; j++) {
                cost[i][j] = graph[i][j];
            }
        }
        for(int k=0; k < V; k++) {
            for(int u=0; u < V; u++) {
                for(int v=0; v < V; v++) {
                    if(cost[u][k] != INF && cost[k][v] != INF &&
                            cost[u][v] > cost[u][k] + cost[k][v]) {
                        cost[u][v] = cost[u][k] + cost[k][v];
                    }
                }
            }
        }
        // Print
        for(int i=0 ; i < V; i++) {
            for(int j=0; j < V; j++) {
                System.out.print(cost[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V = 4;
        int[][] graph = {
                {0, 3, INF, 7},
                {8, 0, 2, INF},
                {5, INF, 0, 1},
                {2, INF, INF, 0}
        };
        FloydWarshallAlgorithm floydWarshallAlgorithm = new FloydWarshallAlgorithm(V, graph);
        floydWarshallAlgorithm.floydWarshall();
    }
}