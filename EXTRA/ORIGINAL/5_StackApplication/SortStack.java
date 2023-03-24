// Sort Stack (6.2)
import java.util.Stack;  
import java.util.Scanner;  
   
class SortStack  
{  
    // Insert the given key into the sorted stack while maintaining its  
    // sorted order. This is similar to the recursive insertion sort routine.  
    public static void sortedInsert(Stack<Integer> stack, int key)  
    {  
        // base case: if the stack is empty or  
        // the key is greater than all elements in the stack  
        if (stack.isEmpty() || key > stack.peek())  
        {  
            stack.push(key);  
            return;  
        }  
   
        /* We reach here when the key is smaller than the top element */  
   
        // remove the top element  
        int top = stack.pop();  
   
        // recur for the remaining elements in the stack  
        sortedInsert(stack, key);  
   
        // insert the popped element back into the stack  
        stack.push(top);  
    }  
   
    // Recursive method to sort a stack  
    public static void sortStack(Stack<Integer> stack)  
    {  
        // base case: stack is empty  
        if (stack.isEmpty()) {  
            return;  
        }  
   
        // remove the top element  
        int top = stack.pop();  
   
        // recur for the remaining elements in the stack  
        sortStack(stack);  
   
        // insert the popped element back into the sorted stack  
        sortedInsert(stack, top);  
    }  
   
    public static void main(String[] args)  
    {  
         // creating a object of the inbuilt class Stack named stack  
        Stack<Integer> stack = new Stack<>();  
        Scanner scan = new Scanner(System.in);  
        char ch;  
        /**  Print all the options to select from**/  
        do      
        {  
            System.out.println("\nSelect one of the operations::\n");  
            System.out.println("1. To insert a new value in the Stack Data Structure.");  
            System.out.println("2. To display the data inside of the Stack Data Structure.");  
            System.out.println("3. To perform Sorting(via Recursion) on the Stack Data Structure.");  
   
            int choice = scan.nextInt();              
            switch (choice)  
            {  
            case 1 :   
                System.out.println("Enter integer element to insert");  
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
            System.out.println("\nDo you want to continue (Type y or n) \n");  
            ch = scan.next().charAt(0);                          
        } while (ch == 'Y'|| ch == 'y');  
    }  
}  