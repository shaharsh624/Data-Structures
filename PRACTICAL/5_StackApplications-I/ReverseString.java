import java.util.Scanner;

public class ReverseString {
    int top;
    int size;
    char[] arr;
    public ReverseString(int size){
        this.top=-1;
        this.size=size;
        this.arr = new char[size];
    }

    void push(char element){
        if (!isFull()){
            arr[++top] = element;
            return;
        }
        System.out.println("Stack Overflow!!");
    }

    char pop(){
        if(!isEmpty()){
            char returnTop = arr[top];
            top--;
            return returnTop;
        }
        System.out.println("Stack is already Empty!!");
        return '-';
    }

    boolean isEmpty(){
        return (top == -1);
    }

    boolean isFull(){
        return (top == size-1);
    }

    void reverse(ReverseString stack, String str){
        int length = str.length();
        String revStr = new String("");
        for (int i=0 ; i<length ; i++){
            stack.push(str.charAt(i));
        }
        for (int j=0 ; j<length ; j++){
            char x = stack.pop();
            revStr += x;
        }
        System.out.println(revStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :: ");
        String str = sc.next();
        ReverseString stack = new ReverseString(str.length());
        stack.reverse(stack, str);

    }
}
