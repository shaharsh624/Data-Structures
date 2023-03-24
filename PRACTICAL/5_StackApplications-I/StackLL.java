public class StackLL {
    Node top;
    class Node{
        int data;
        Node next;
    }

    public StackLL() {
        this.top = null;
    }

    void push(int element){
        Node node = new Node();
        if (node == null){
            System.out.println("Stack Overflow!!");
            return;
        }
        node.data = element;
        node.next = top;
        top = node;
    }

    void pop(){
        if (top==null){
            System.out.println("Stack is Empty!!");
            return;
        }
        top = top.next;
    }

    void display(){
        if (top == null){
            return;
        }
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(9);
        stack.push(7);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(0);
        stack.display();
        stack.pop();
        stack.display();
    }
}
