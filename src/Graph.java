import java.util.ArrayList;
import java.util.Arrays;
public class Graph {
    int V; int[][] graph;
    Graph(int V) {
        this.V = V;
        this.graph = new int[V][V];
    }
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        ArrayList<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int current;
        while(!q.isEmpty()) {
            current = q.get(0);
            System.out.print(current + " ");
            q.remove( q.get(0) );
            for(int i=0; i < V; i++) {
                if(graph[current][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        dfsUtil(start, visited);
    }
    public void dfsUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i=0; i < V; i++) {
            if(graph[start][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        Graph graph = new Graph(V);
        graph.graph = new int[][] {
                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0}
        };
        graph.bfs(0);                           // 0 1 3 2 4 5 6
        graph.dfs(0);                           // 0 1 2 5 4 3 6
    }

}
