public class CircularQueue {
    Integer[] arr;
    int len, front, rear;
    CircularQueue(int l){
        arr = new Integer[l];
        front = -1;
        rear = -1;
        len = l;
    }

    public boolean isfull(){
        if ((front==0&&rear==len-1)||(front==rear+1)){
            return true;
        }
        return false;
    }

    public boolean isempty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    public void enqueue(int n){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                arr[0] = n;
                front = 0;
                rear = 0;
            }
            else{
                rear = (rear+1)%len;
                arr[rear] = n;
            }
        }
    }

    public void dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");// 1 - 3 4
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            arr[front] = null;
            front = (front+1)%len;
        }
    }

    public void display(){
        if (isempty()){
            System.out.println("Queue is empty");
        }
        if(rear>=front){
            for(int i=front; i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i =front; i<len; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args){
        CircularQueue q = new CircularQueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.display();

    }
}
