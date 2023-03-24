import java.util.Scanner;

public class Commonelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Find common element between two arrays

        System.out.print("Enter length of first array: ");
        int a = input.nextInt();
        System.out.print("Enter length of second array: ");
        int b = input.nextInt();
        int [] array1 = new int [a];
        int [] array2 = new int [b];
        for(int i = 0; i < a; i ++){
            array1 [i]= input.nextInt();
        }
        for(int i = 0; i < b; i ++){
            array2 [i] = input.nextInt();
        }

        for(int i = 0; i < a; i ++){
            for(int j = 0; j < b; j ++){
                if(array1 [i] == array2[j]){
                    System.out.println(array1 [i] + " is common element");
                    break;
                }
            }
        }
        input.close();
    }
}
