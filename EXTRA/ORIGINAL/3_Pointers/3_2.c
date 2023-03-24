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

    printf("Age of Person is: %d\n", Ptr->age);
    printf("weight of Person is: %f\n", Ptr->weight);
    printf("Height of Person is: %d\n", Ptr->height);

    return 0;
}
