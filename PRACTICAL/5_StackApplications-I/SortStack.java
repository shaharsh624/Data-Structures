// Sort Stack (6.2)
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