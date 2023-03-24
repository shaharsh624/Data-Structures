import java.util.Scanner;

public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int n;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {  
            array[i]=sc.nextInt();
        }
        
        System.out.println("Before Selection Sort");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(array);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
    }  
}  