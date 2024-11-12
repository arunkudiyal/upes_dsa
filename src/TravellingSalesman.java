public class TravellingSalesman {
    int V; int[][] matrix;
    TravellingSalesman(int V, int[][] matrix) {
        this.V = V;
        this.matrix = matrix;
    }
    public void travellingSalesmanGreedy() {

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
        travellingSalesman.travellingSalesmanGreedy();
    }
}
