#include <stdio.h>

struct student {
    int rollno;
    int sem;
};
void main()
{
    struct student s1, s2;
    struct student *ptr;
    ptr = &s1;

    scanf("%d", &s1.rollno);
    scanf("\n%d", &s1.sem);
    printf("\n%d", ptr->sem);
    printf("\n%d", ptr->rollno);

}