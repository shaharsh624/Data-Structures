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
                stack.pop(); // To remove the '('
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
