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
