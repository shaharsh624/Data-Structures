import java.util.Scanner;

public class Keyelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //An element in an array is key element if all the elements right to it are less than it. Print all the key elements of an array.

        System.out.print("Enter length of array: ");
        int n = input.nextInt();
        int [] array = new int [n];
        for(int i = 0; i < n; i ++){
            array [i] = input.nextInt();
        }

        for(int i = 0; i < n; i ++){
            int count = 0;
            for(int j = 1; j < n; j ++){
                if(array [i] > array [j]);
                else {
                    count ++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(array [i]);
            }
            count = 0;
        }
        input.close();
    }
}
