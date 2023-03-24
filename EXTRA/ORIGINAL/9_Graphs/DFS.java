// Depth First Search

import java.util.*;
class Graph{
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    Graph(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }
    // Adding edge
    void addEdge(int src, int dest){
        adjLists[src].add(dest);

    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.println(vertex + " ");

        for (int adj : adjLists[vertex]) {
            if (!visited[adj]) {
                DFS(adj);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,1);

        g.DFS(0);
        g.DFS(1);
        g.DFS(2);
        g.DFS(3);
    }

}
