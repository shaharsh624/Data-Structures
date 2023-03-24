#include <stdio.h>

void maxElement(int data[], int size){
    int max = data[0];
    for (int i=1 ; i<size ; i++){
        if (data[i] > max){
            max = data[i];
        }
    }
    printf("\nMaximum element in the array is: %d", max);
}

void minElement(int data[], int size){
    int min = data[0];
    for (int i=1 ; i<size ; i++){
        if (data[i] < min){
            min = data[i];
        }
    }
     printf("\nMinimum element in the array is: %d", min);
}


int main(){
    
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int data [n];
    
    //Inputing the array
    printf("Enter elements of array: ");
    for(int i = 0; i < n; i ++) {
        scanf("%d", &data[i]);
    }
    maxElement(data, n);
    minElement(data, n);


}