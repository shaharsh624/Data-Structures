// Queue implementation using Array (7.1)

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
  
    Queue() {
      front = -1;
      rear = -1;
    }
    
    // Is Full
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    // Is Empty
    boolean isEmpty() {
      return (rear == -1 && front == -1);
    }
  
    // Enqueue
    void enQueue(int element) {
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (front == -1){
            front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
        else{
          rear++;
          items[rear] = element;
          System.out.println("Inserted " + element); 
        }
      }
    }
  
    // Dequeue
    int deQueue() {
      int element;
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
        element = items[front];
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
          front++;
        }
        System.out.println("Deleted: " + element);
        return (element);
      }
    }
  
    // Displaying the Queue
    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
        System.out.println("\nFront index: " + front);
        System.out.println("Items: ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
        System.out.println("\nRear index: " + rear);
      }
    }
  
    public static void main(String[] args) {
      Queue q = new Queue();
  
      q.deQueue();
      q.enQueue(1);
      q.enQueue(2);
      q.enQueue(3);
      q.enQueue(4);
      q.enQueue(5);
      q.enQueue(6);
      q.display();
      q.deQueue();
      q.display();
  
    }
  }