import java.util.ArrayList;
import java.util.List;

public class EulerianPath {
    private int V; private int[][] adjMatrix;
    public EulerianPath(int[][] matrix) {
        this.V = matrix.length;
        this.adjMatrix = matrix;
    }
    // Method to find and return the Eulerian Path if it exists
    public List<Integer> findEulerianPath() {
        List<Integer> path = new ArrayList<>();
        int startVertex = 0; int odd = 0;
        int[] degrees = new int[V];
        for(int u=0; u < V; u++) {
            int degree = 0;
            for(int v=0; v < V; v++) {
                if(adjMatrix[u][v] == 1) degree += 1;
            }
            degrees[u] = degree;
            if(degree % 2 != 0) odd += 1;
        }
        if(odd != 0 && odd != 2) return path;
        for(int i=0; i < V; i++) {
            if(degrees[i] % 2 != 0) {
                startVertex = i;
            }
        }
        System.out.println(startVertex);
        return path;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        EulerianPath graph = new EulerianPath(matrix);
        List<Integer> eulerianPath = graph.findEulerianPath();
        if (!eulerianPath.isEmpty()) {
            System.out.println("Eulerian Path: " + eulerianPath);
        } else {
            System.out.println("No Eulerian Path exists.");
        }
    }
}