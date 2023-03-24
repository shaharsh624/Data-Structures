// Swapping of two values
#include <stdio.h>
void swap(int *n1, int *n2){
    int temp = *n2;
    *n2 = *n1;
    *n1 = temp;
}
void main()
{
    int n1=1;
    int n2=4;

    swap(&n1, &n2);
    printf("%d, %d",n1,n2);

}