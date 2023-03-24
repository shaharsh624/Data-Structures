import java.util.*;

public class CreateGraph {

    public static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void newGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
    }

    static boolean hasPath(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest) {
        if (src == dest){
            return true;
        }
        visited[src] = true;
        for (int i=0; i<graph[src].size() ; i++){
            Edge e = graph[src].get(i);
            if (!visited[e.dest]){
                hasPath(graph, visited, e.dest, dest);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        newGraph(graph);
        System.out.println(hasPath(graph, new boolean[V], 1,4));
        System.out.println(hasPath(graph, new boolean[V], 2,4));
        System.out.println(hasPath(graph, new boolean[V], 3,2));
    }
}