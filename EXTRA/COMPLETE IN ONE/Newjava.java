
/*
public class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public Node find(String value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //traverse
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void addAfter(int loc, String new_data) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = temp.next;
        temp.next = new_node;
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null){ //Single node only
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void deleteLoc(int loc){
        if (head == null){
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list  = new LL();

        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLoc(2);
        list.printList();

        list.addLast("5");
        list.printList();

        list.addAfter(2,"4");
        list.printList();
    }
}
*/




/*
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
*/



/*
public class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public Node find(String value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //traverse
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void addAfter(int loc, String new_data) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = temp.next;
        temp.next = new_node;
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null){ //Single node only
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void deleteLoc(int loc){
        if (head == null){
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list  = new LL();

        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLoc(2);
        list.printList();

        list.addLast("5");
        list.printList();

        list.addAfter(2,"4");
        list.printList();
    }
}
*/



/*
public class CreateStack {
    int top;
    int size;
    int[] arr;
    public CreateStack(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new int[size];
    }

    void push(int element){
        if (!isFull()){
            arr[++top] = element;
            System.out.println("Pushed " + element);
            return;
        }
        System.out.println("Stack Overflow!!");
    }

    void pop(){
        if(!isEmpty()){
            int returnTop = arr[top];
            top--;
            System.out.println("\nPopped " + returnTop);
            return;
        }
        System.out.println("Stack is already Empty!!");
    }

    boolean isEmpty(){
        return (top == -1);
    }

    boolean isFull(){
        return (top == size-1);
    }

    void display(){
        System.out.print("\nStack: ");
        for (int i=0 ; i<=top ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void getTop(){
        System.out.println("\nTop: " + top);;
    }
    void getSize(){
        System.out.println("Size: " + top+1);;
    }

    public static void main(String[] args) {
        CreateStack stack = new CreateStack(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.display();
        stack.pop();
        stack.display();
        stack.getTop();
        stack.getSize();
    }
}

*/



/*
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

 */