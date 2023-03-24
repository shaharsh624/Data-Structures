import java.util.Scanner;
public class BubbleSort {
    static void bubbleSort(int[] array) {  
        int n = array.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }   
            }  
        }  
    }  
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
                 
        System.out.println("Before Bubble Sort");
        for (int k : array) {
            System.out.print(k + " ");
        }  

        System.out.println();  
        bubbleSort(array);
        System.out.println("After Bubble Sort");
        for (int j : array) {
            System.out.print(j + " ");
        }
   
        }  
}  