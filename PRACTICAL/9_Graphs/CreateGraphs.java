// Create Graph, BFS, DFS(Recursion-Stack), hasPath
import java.util.*;

public class CreateGraphs {
    static class Edge {
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
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,2));

    }

    static void bfs(ArrayList<Edge>[] graph,  boolean[] visited, int src) {
        Queue<Integer> que = new LinkedList<>();
        que.add(src);
        while (!que.isEmpty()) {
            int curr = que.remove();

            if (!visited[curr]) {
                System.out.print(curr + " "); //Step-1
                visited[curr] = true; //Step-2
                //Step-3 adding all neighbours of curr in queue
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    que.add(e.dest);
                }
            }
        }
    }

    static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        // Visit current(src) node
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i=0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]){
                dfs(graph,e.dest, visited);
            }
        }
    }

    static void dfsStack(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(src);
        while(!stack.isEmpty()) {
            int curr = stack.pop();

            if (!visited[curr]) {
            System.out.print(curr + " ");
            visited[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                stack.push(e.dest);
                }
            }
        }
    }

    // Cycle in Graph (DFS)
    /*
    static boolean dfsCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(src);

        while(!stack.isEmpty()) {
            int curr = stack.pop();
            // Visit current(src) node
            visited[curr] = true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    visited[e.dest] = true;
                    stack.push(e.dest);
                    dfsCyclic(graph, e.dest,visited);
                }
            }
        }
        return false;
    }
    */

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
        int V=10;
        ArrayList<Edge>[] graph = new ArrayList[V];

        newGraph(graph);

        bfs(graph, new boolean[V],0);
        System.out.println();

        dfs(graph, 0, new boolean[V]);
        System.out.println();

        dfsStack(graph, 0, new boolean[V]);
        System.out.println();

        System.out.println(hasPath(graph, new boolean[V], 1,4));;
    }
}