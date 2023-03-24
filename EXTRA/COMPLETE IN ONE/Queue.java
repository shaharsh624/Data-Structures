// Queue
/*
import com.sun.jdi.request.BreakpointRequest;

public class CreateQueue {
    static int front, rear, size;
    static int[] queue;

    public CreateQueue(int capacity) {
        front = -1;
        rear = size-1;
        size = capacity;
        queue = new int[size];
    }

    static boolean isEmpty(){
        if (front == -1){
            System.out.println("Queue is Empty!");
            return true;
        }
        return false;
    }

    static boolean isFull(){
        if ((front==1 && rear==size) | front == rear+1){
            System.out.println("Queue is full!");
            return true;
        }
        return false;
    }

    static void enQueue(int data){
        if (isFull()){
            return;
        }
        else if (front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println(data + " enqueued");
        return;
    }

    static void deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }

        else {
            if (front == rear) {
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return;
        }
    }

    static void display(){
        int i;
        if (isEmpty()){
            return;
        }
        for (i=front ; i!=rear ; i = (i + 1) % size){
            System.out.print(" <- " + queue[i]);
        }
        System.out.println(" <- " + queue[i]);
        return;
    }

    public static void main(String[] args) {
        CreateQueue queue = new CreateQueue(6);
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        display();
        deQueue();
        display();
    }
}
*/

// Dequeue
/*
// Question 7.4-7.5
class Deque {
    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size;

    public Deque(int size) {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertfront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
            front = size - 1;
        else
            front = front - 1;

        arr[front] = key;
    }

    void insertrear(int key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        }
        else if (rear == size - 1)
            rear = 0;
        else
            rear = rear + 1;
        arr[rear] = key;
    }

    void deletefront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (front == size - 1) {
            front = 0;
        }
        else {
            front = front + 1;
        }
    }

    void deleterear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }
     int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }
    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);

        System.out.println("Insert element at rear end  : 5 ");
        dq.insertrear(5);
        System.out.println("insert element at rear end : 10 ");
        dq.insertrear(10);
        System.out.println("Get rear element : " + dq.getRear());
        dq.deleterear();
        System.out.println("After delete rear element new rear become : " + dq.getRear());
        System.out.println("Inserting element at front end");
        dq.insertfront(15);
        System.out.println("Get front element: " + dq.getFront());
        dq.deletefront();
        System.out.println("After delete front element new front become : " + dq.getFront());
    }
}
*/

// Priority Queue
/*
class Node {
    public int value;
    public int priority;
}

class PriorityQueue {
    static Node[] pr = new Node[1000];
    static int size = -1;
    static void enqueue(int value, int priority){
        size++;
        pr[size] = new Node();
        pr[size].value = value;
        pr[size].priority = priority;
    }
    static int peek() {
        int highestPriority = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i <= size; i++) {
            if (highestPriority == pr[i].priority
                    && ind > -1
                    && pr[ind].value < pr[i].value) {
                highestPriority = pr[i].priority;
                ind = i;
            }
            else if (highestPriority < pr[i].priority) {
                highestPriority = pr[i].priority;
                ind = i;
            }
        }
        return ind;
    }
    static void dequeue(){
        int ind = peek();
        for (int i = ind; i < size; i++) {
            pr[i] = pr[i + 1];
        }
        size--;
    }

    public static void main(String[] args){
        enqueue(10, 2);
        enqueue(16, 4);
        enqueue(14, 4);
        enqueue(12, 3);
        int ind = peek();
        System.out.println(pr[ind].value);
        dequeue();
        ind = peek();
        System.out.println(pr[ind].value);
        dequeue();
        ind = peek();
        System.out.println(pr[ind].value);
    }
}
*/

// Queue using Stack
/*
//queue using 2 stacks
import java.util.*;

public class QueueStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            return s1.pop();
        }

        public static int peek() {
            return s1.peek();
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

// Queue using LL
/*
class Queue {
	Node front, rear;
    private class Node {
        int key;
        Node next;
        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
	public Queue() {
		this.front = this.rear = null;
	}
	void enqueue(int key)	{
		Node temp = new Node(key);
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
        System.out.println(key + " enqueued");
	}
	void dequeue()	{
		if (this.front == null)
			return;
		Node temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
            this.rear = null;
        }
        System.out.println("dequeued");
	}
    public static void main(String[] args)	{
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Front element: " + q.front.key);
        System.out.println("Rear element: " + q.rear.key);
    }
}
*/
