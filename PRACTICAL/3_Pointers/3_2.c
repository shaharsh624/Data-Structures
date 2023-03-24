#include <stdio.h>

struct person{
   int age;
   float weight;
   int height;
};

int main(){
    struct person *Ptr, person1;
    Ptr = &person1;   

    printf("Enter age of Person: ");
    scanf("%d", &Ptr->age);

    printf("Enter weight of Person: ");
    scanf("%f", &Ptr->weight);
    
    printf("Enter height of Person: ");
    scanf("%d", &Ptr->height);

    printf("\nAge of Person is: %d", Ptr->age);
    printf("\nWeight of Person is: %f", Ptr->weight);
    printf("\nHeight of Person is: %d", Ptr->height);

    return 0;
}
