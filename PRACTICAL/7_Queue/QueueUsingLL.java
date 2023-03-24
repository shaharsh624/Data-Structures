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
		if (this.front == null) { return; }
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