import java.util.Arrays;
import java.util.Scanner;

public class ArraySplit {
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

        //Spliting in two arrays
        int [] arrays = new int [d];
        int [] arr = new int [n - d];
        for(int i = 0; i < d; i ++){
            arrays [i] = array[i];
        }
        for(int i = d; i < n; i ++){
            arr [i - d] = array [i];
        }

        //Merging both the arrays 
        int [] array1 = new int [n];
        for(int i = 0; i < n - d; i ++){
            array1 [i] = arr [i];
        }
        for(int i = n - d; i < n; i ++){
            array1 [i] = arrays [i - n + d];
        }
        System.out.println(Arrays.toString(array1));
        input.close();
    }
}
