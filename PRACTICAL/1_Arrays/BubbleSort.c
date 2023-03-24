#include <stdio.h>

int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr [n];
    
    //Inputing the array
    printf("Enter elements of array");
    for(int i = 0; i < n; i ++) {
        scanf("%d", &arr[i]);
    }
    
    //Bubble Sort algorithm
    for(int i = 0; i < n; i ++) {
        for(int j = 0; j < n; j ++) {
            if(arr[j + 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
    //Printing the sorted array
    for(int i = 0; i < n; i ++) {
        printf("%d ", arr[i]);
    }
    
    //Insertion Sort algorithm
    for (int i = 1; i < n; i++) {   
        int element = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > element) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
        } 
        arr[j + 1] = element; 
    } 
    
    //Printing the sorted array
    for(int i = 0; i < n; i ++) {
        printf("%d ", arr[i]);
    }
    
    //Selection Sort algorithm
    for(int i = 0; i < n - 1; i++)    {
        int position=i;
        for(int j = i + 1; j < n; j++)        {
            if(arr[position] > arr[j])
                position=j;
        }
        if(position != i)        {
            int swap;
            swap=arr[i];
            arr[i]=arr[position];
            arr[position]=swap;
        }
    }
    
    //Printing the sorted array
    for(int i = 0; i < n; i ++) {
        printf("%d ", arr[i]);
    }
    return 0;
}
