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
