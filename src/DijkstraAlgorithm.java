import java.util.Scanner;

public class DijkstraAlgorithm {
    int V; int[][] graph;
    DijkstraAlgorithm(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public void dijkstra(int[][] graph, int start) {

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
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        da.dijkstra(da.graph, start);
    }
}
