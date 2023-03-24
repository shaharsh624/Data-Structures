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

    static void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        } else if (front == rear) {
            front = rear = -1;
            return;
        }
        front = (front + 1) % size;
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
