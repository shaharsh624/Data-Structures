// Stack using an array (5.1)
public class StackOperations {
    int size;
    int[] arr;
    int top;

    StackOperations(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
 
    public void push(int Element) {
        if (!isFull()) {
            top++;
            arr[top] = Element;
            System.out.println("Pushed element:" + Element);
        }
        else {
            System.out.println("Stack is full !");
        }
    }
 
    public void pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);

        }
        else {
            System.out.println("Stack is empty !");
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == top);
    }
 
    public static void main(String[] args) {
        StackOperations StObj = new StackOperations(10);
        StObj.pop();
        System.out.println();
        StObj.push(10);
        StObj.push(30);
        StObj.push(50);
        StObj.push(40);
        System.out.println();
        StObj.pop();
        StObj.pop();
        StObj.pop();
        System.out.println();
    }
}
