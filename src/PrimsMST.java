public class PrimsMST {
    int V; int[][] graph;
    PrimsMST(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public void primsMST(int[][] graph) {

    }
    public static void main(String[] args) {
        int V = 9;
        PrimsMST primsMST = new PrimsMST(V);
        primsMST.graph = new int[][] {
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
        primsMST.primsMST(primsMST.graph);
    }
}