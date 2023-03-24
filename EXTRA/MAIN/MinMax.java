import java.util.Scanner;

public class MinMax {
    public int max(int [] array) {
       int max = 0;
       for(int i=0; i<array.length; i++ ) {
          if(array[i]>max) {
             max = array[i];
          }
       }
       return max;
    }
    public int min(int [] array) {
       int min = array[0];
       for(int i=0; i<array.length; i++ ) {
          if(array[i]<min) {
             min = array[i];
          }
       }
       return min;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {  
            array[i]=sc.nextInt();
        }
       MinMax m = new MinMax();
       System.out.println("Maximum element in the array is: "+m.max(array));
       System.out.println("Minimum element in the array is: "+m.min(array));
    }
 }