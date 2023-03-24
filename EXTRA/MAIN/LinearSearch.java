import java.util.Scanner;
public class LinearSearch{    
    public static int linearSearch(int[] arr, int key){    
            for(int i=0;i<arr.length;i++){    
                if(arr[i] == key){    
                    return i;    
                }    
            }    
            return -1;    
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
        System.out.println("Enter the Element to be searched");
        int key = sc.nextInt();
        System.out.println(key+" found at index: "+linearSearch(array, key));
    }    
}