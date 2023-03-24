#include <stdio.h>

void secMinMax(int arr[], int n){
    int count = n;
    int a;
    for (int i = 0; i < count; i++) {
       for (int j = i + 1; j < count; j++) {
          if (arr[i] > arr[j]) {
             a = arr[i];
             arr[i] = arr[j];
             arr[j] = a;
          }
       }
    }
    
    printf("\nMinimum: %d" , arr[0]);
    printf("\nMaximum: %d" , arr[n-1]);     
    printf("\nSecond Minimum: %d" , arr[1]);
    printf("\nSecond Maximum: %d" , arr[n-2]);     
}

int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr [n];
    
    //Inputing the array
    printf("Enter elements of array: ");
    for(int i = 0; i < n; i ++) {
        scanf("%d", &arr[i]);
    }

    secMinMax(arr, n);

    return 0;
    
}