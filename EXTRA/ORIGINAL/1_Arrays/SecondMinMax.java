import java.util.*;
public class SecondMinMax {
    public static void main(String []args){
        int a;
        int n;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {  
            array[i]=sc.nextInt();
        }

        int count = array.length;
        for (int i = 0; i < count; i++) {
           for (int j = i + 1; j < count; j++) {
              if (array[i] > array[j]) {
                 a = array[i];
                 array[i] = array[j];
                 array[j] = a;
              }
           }
        }
        System.out.println("Smallest: "+array[0]);
        System.out.println("Largest: "+array[count-1]);
        System.out.println("Second Smallest: "+array[1]);
        System.out.println("Second Largest: "+array[count-2]);
   }
}