// Stack
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

// Stack Using LL
/*
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
*/

// Infix to Postfix
/*
import java.util.*;
public class InfixtoPostfix {
    static int precedence(char c){
        return switch (c) {
            case ('+'), ('-') -> 1;
            case ('*'), ('/') -> 2;
            case ('^') -> 3;
            default -> -1;
        };
    }

    static String inToPost(String expression){
        String result = new String("");
        Stack<Character> stack = new Stack();

        for (int i=0 ; i< expression.length() ; i++){
            char c = expression.charAt(i);

            // Letter or Digit is encountered
            if (Character.isLetterOrDigit(c)){
                result += c;
            }
            // '(' is encountered
            else if(c == '('){
                stack.push(c);
            }
            // ')' is encountered
            else if(c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            // Operand in encountered
            else{
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            if (stack.peek() == '('){
                return "Invalid Expression";
            }
            result += stack.peek();
            stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InfixtoPostfix itp = new InfixtoPostfix();

        String expression = sc.next();
        System.out.println("Postfix expression :: " + inToPost(expression));;
    }
}

 */

// Evaluate Postfix
/*
import java.util.*;
public class EvalPostfix {
    static int evalPost(String expression){
        Stack<Integer> stack = new Stack<>();
        for (int i=0 ; i<expression.length() ; i++){
            char c = expression.charAt(i);
            if (Character.isDigit(c)){    // 0 is subtracted to convert any alphabet
                stack.push(c - '0'); // to number, acc. to its ascii value
            }
            else {
                int a = stack.pop();
                int b = stack.pop();
                switch (c) {
                    case ('+') -> stack.push(b + a);
                    case ('-') -> stack.push(b - a);
                    case ('*') -> stack.push(b * a);
                    case ('/') -> stack.push(b / a);
                    case ('^') -> stack.push(b ^ a);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvalPostfix post = new EvalPostfix();
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        System.out.println("Postfix Evaluation: " + evalPost(exp));;
    }
}
*/

// Balanced Brackets
/*
import java.util.*;
public class BalancedBrackets {
	static boolean areBracketsBalanced(String expr){
		ArrayDeque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
				case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
						return false;
					break;

				case '}':
					check = stack.pop();
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
						return false;
					break;
			}
		}

		return (stack.isEmpty());
	}
	public static void main(String[] args){
		String expr = "[( ])" ;
		if (areBracketsBalanced(expr))
			System.out.println("\nBalanced \n");
		else
			System.out.println("\nNot Balanced \n");
	}
}
*/

// Sort Stack
/*
import java.util.Stack;
import java.util.Scanner;

class SortStack {
    public static void sortedInsert(Stack<Integer> stack, int key) {
        if (stack.isEmpty() || key > stack.peek())  {
            stack.push(key);
            return;
        }
        int top = stack.pop();
        sortedInsert(stack, key);
        stack.push(top);
    }
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.println("1. To insert a new value in the Stack Data Structure.");
            System.out.println("2. To display the data inside of the Stack Data Structure.");
            System.out.println("3. To perform Sorting(via Recursion) on the Stack Data Structure.");
            System.out.print("\nSelect one of the operations :: ");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 :
                System.out.print("Enter integer element to insert :: ");
                stack.push(scan.nextInt());
                break;
            case 2 :
                System.out.println("Stack:: "+stack);

                break;
            case 3 :
                System.out.println("Sort done.");
                sortStack(stack);
                break;
            default :
                System.out.println("Wrong Entry \n ");
                break;
            }
            System.out.print("Do you want to continue (Type y or n) :: ");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
*/

// Reverse String using Stack
/*
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
*/