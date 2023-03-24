// Structure --> Student Details
#include <stdio.h>

struct student {
    char name[15];
    char address[50];
    int rno;
};

int main() {
    struct student s1;
    scanf("%s", s1.name);
    scanf("%s", s1.address);
    scanf("%d", &s1.rno);
    
    printf("Name of student is %s", s1.name);
    printf("\nAddress of student is %s", s1.address);
    printf("\nRoll number of student is %d", s1.rno);

    return 0;
}
