#include <stdio.h>

int main(){
    //pointer to an array
    int arr[5] = {6, 2, 1, 7, 5};
    int *ptr = &arr[0];
    printf("Array: ");
    for(int i = 0; i < 5; i ++) {
        printf("%d ", *(ptr + i));
    }
    
    //array of pointers
    int  var[] = {10, 100, 200};
 
    printf("\n\nArray of Pointer: ");
    for (int i = 0; i < 3; i ++) {
      printf("\nValue of var[%d] = %d", i, var[i] );
    }

    return 0;
}
