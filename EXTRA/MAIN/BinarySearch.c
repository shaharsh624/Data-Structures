// Binary Search
#include <stdio.h>

int main(){
  int n, c, array[100], ele, first, last, mid;

  printf("Enter the number of elements: ");
  scanf("%d", &n);

  printf("\nEnter Array Elements: ", n);
  for (c = 0; c < n; c++){
    scanf("%d", &array[c]);
  }

  printf("\nEnter element to be searched: ");
  scanf("%d", &ele);

  first = 0;
  last = n - 1;
  mid = (first+last)/2;

  while (first <= last) {
    if (array[mid] < ele){
      first = mid + 1;
    }
    else if (array[mid] == ele) {
      printf("\n%d found at location %d.", ele, mid+1);
      break;
    }
    else{
      last = mid - 1;
    }
    mid = (first + last)/2;
  }

  if (first > last){
    printf("\nElement not found!", ele);
  }

  return 0;
}