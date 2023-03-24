#include <stdio.h>

// Swap Function
void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

void selectionSort(int array[], int size) {
  for (int step = 0; step < size - 1; step++) {
    int min_idx = step;
    for (int i = step + 1; i < size; i++) {
      if (array[i] < array[min_idx])
        min_idx = i;
    }
    swap(&array[min_idx], &array[step]);
  }
}

// Function to print an array
void printArray(int array[], int size) {
  for (int i = 0; i < size; ++i) {
    printf("%d  ", array[i]);
  }
  printf("\n");
}

int main() {
  int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int data [n];
    
    //Inputing the array
    printf("Enter elements of array: ");
    for(int i = 0; i < n; i ++) {
        scanf("%d", &data[i]);
    }

  selectionSort(data, n);
  printf("Sorted array in Acsending Order:\n");
  printArray(data, n);
}