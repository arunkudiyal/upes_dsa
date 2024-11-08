public class BellmanFordAlgorithm {
    int V; int[][] graph;
    public BellmanFordAlgorithm(int vertices, int[][] graph) {
        this.V = vertices;
        this.graph = graph;
    }
    public void bellmanFordAlgorithm(int source) {

    }
    public static void main(String[] args) {
        int vertices = 5;
        int[][] graph = {
                {0, -1, 4, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, 3, 2, 2},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 1, 5, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -3, 0}
        };
        BellmanFordAlgorithm bellmanFord = new BellmanFordAlgorithm(vertices, graph);
        int source = 0;
        bellmanFord.bellmanFordAlgorithm(source);
    }
}
