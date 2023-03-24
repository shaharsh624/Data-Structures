#include <stdio.h>

struct student {
    char name[15];
    char address[50];
    int rno;
};

int main(){
    struct student s[5];
    for (int i=0;i<=2;i++){
        printf("\nEnter name of student %d: ",i+1);
        scanf("\n%s", s[i].name);
        printf("Enter address of student %d: ",i+1);
        scanf("%s", s[i].address);
        printf("Enter roll number of student %d: ",i+1);
        scanf("%d", &s[i].rno);
    }
    for (int i=0;i<=4;i++){
        printf("\n%d :: %s :: %s", s[i].rno, s[i].name, s[i].address);
    }
    return 0;
}
