#include<stdio.h>

void main()
{
    int arr[5] = { 1, 2, 3, 4, 5 };
    int *ptr = arr;
    printf("%d\n", *ptr);
    ptr++;
    printf("%d\n", *ptr);
    ptr++;
    printf("%d\n", *ptr);
    ptr++;
    printf("%d\n", *ptr);
    ptr++;
    printf("%d\n", *ptr);

}
