// Swappping of two numbers using Pointer
#include <stdio.h>

void swap(int *x,int *y){
    int t;
     t   = *x;
    *x   = *y;
    *y   =  t;
}

int main(){
    int a, b;

    printf("Enter value of first number: ");
    scanf("%d",&a);
    printf("Enter value of second number: ");
    scanf("%d",&b);

    printf("Before Swapping: %d, %d\n",a,b);
    swap(&a,&b);
    printf("After  Swapping: %d, %d\n",a,b);

    return 0;
}