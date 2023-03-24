#include <stdio.h>

struct student {
    char name[15];
    char address[50];
    int rno;
};

int main() {
    struct student s1;
    printf("Enter Name of student: ");
    scanf("%s", s1.name);
    printf("Enter Address of student: ");
    scanf("%s", s1.address);
    printf("Enter Roll number of student: ");
    scanf("%d", &s1.rno);
    
    printf("Name of student: %s", s1.name);
    printf("\nAddress of student: %s", s1.address);
    printf("\nRoll number of student: %d", s1.rno);

    return 0;
}
