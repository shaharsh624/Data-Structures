// Linear Search
#include <stdio.h>

int main(){
    int n,i,ele,loc=-1;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n];

    printf("\nEnter Array Elements: ");
    for (i=0 ; i<n ; i++){
        scanf("%d", &a[i]);
    }
    printf("\nArray: ");
    for (i=0 ; i<n ; i++){
        printf("%d ", a[i]);
    }

    printf("\nEnter element to be searched: ");
    scanf("%d", &ele);

     for(i=0 ; i<n ; i++){
        if(a[i] == ele){
            loc = i;
            break;
        }
     }

    if (loc != -1){
        printf("\nElement %d found at index %d", ele,loc);
    }
    else{
        printf("\nElement not found!");
    }

  return 0;  
}  