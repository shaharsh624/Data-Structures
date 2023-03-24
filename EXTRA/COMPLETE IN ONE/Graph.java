import java.util.*;

class Graph{
    private int V; // No. of vertices
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w);
    }

    Boolean isReachable(int s, int d) {
        LinkedList<Integer>temp;
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);

        Iterator<Integer> i;
        while (queue.size()!=0) {
            s = queue.poll();
            int n;
            i = adj[s].listIterator();
            while (i.hasNext()) {
                n = i.next();
                if (n==d)
                    return true;
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert number of edes: ");
        int n = sc.nextInt();
        Graph g = new Graph(n);

        System.out.println("Enter Graph: ");
        for (int i=0 ; i<5 ; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            g.addEdge(v1,v2);
        }
        System.out.print("For what edge do you want to check path: ");
        int u = sc.nextInt();
        int v = sc.nextInt();

        if (g.isReachable(u, v)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}