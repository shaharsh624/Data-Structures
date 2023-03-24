import java.util.Scanner;
class BinarySearch{  
    public static void binarySearch(int arr[], int first, int last, int key){  
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     
         }
         else if ( arr[mid] == key ){
           System.out.println(key + " found at index: " + mid);
           break;  
         }
         else{
            last = mid - 1;  
         }  
         mid = (first + last)/2;  
      }  
      if ( first > last ){  
         System.out.println("Element is not found!");  
      }  
    }  
    public static void main(String args[]){
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
        int last=array.length-1;
        binarySearch(array,0,last,key);
    }  
}  