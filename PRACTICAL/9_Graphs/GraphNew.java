import java.util.*;

public class Graph {
    static class Edge{
        int src;
        int dest;

        Edge (int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }

    static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int src){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while(!queue.isEmpty()){
            int curr = queue.remove();
            if (!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i=0 ; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int src){
        Stack<Integer> stack = new Stack<>();
        stack.push(src);

        while(!stack.isEmpty()){
            int curr = stack.pop();

            if (!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i=0 ; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    stack.push(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bfs(graph, new boolean[V], 0);
        System.out.println();
        dfs(graph, new boolean[V], 0);
    }
}

