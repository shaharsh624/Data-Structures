import java.util.Arrays;
import java.util.Scanner;

public class ArraySplitOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        System.out.print("Enter the number where array will split: ");
        int d = input.nextInt();

        //Inputing main array
        int [] array = new int [n];
        for(int i = 0; i < n; i ++){
            array [i] = input.nextInt();
        }
        
        //Reversing an array
        int [] array1 = new int [n];
        for(int i = d; i < n; i ++){
            array1 [i - d] = array [i];
        }
        for(int i = 0; i < d; i ++){
            array1 [n - d + i] = array [i];
        }
        System.out.println(Arrays.toString(array1));
        input.close();
    }
}
