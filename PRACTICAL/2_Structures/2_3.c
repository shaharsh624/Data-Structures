#include <stdio.h>

struct organization {
    char name[15];
    int ID;
    struct employee {
        char name[15];
        long salary;
        int ID;
    } e1, e2;
};

int main(){
    struct organization o1, o2;
    printf("Enter details of first Organization\n");
    scanf("%s", o1.name);
    scanf("%d", &o1.ID);
    
    printf("Enter details of first employee of first Organization\n");
    scanf("%s", o1.e1.name);
    scanf("%ld", &o1.e1.salary);
    scanf("%d", &o1.e1.ID);
    
    printf("Enter details of second employee of first Organization\n");
    scanf("%s", o1.e2.name);
    scanf("%ld", &o1.e2.salary);
    scanf("%d", &o1.e2.ID);
    
    printf("Enter details of second Organization\n");
    scanf("%s", o2.name);
    scanf("%d", &o2.ID);
    
    printf("Enter details of first employee of second Organization\n");
    scanf("%s", o2.e1.name);
    scanf("%ld", &o2.e1.salary);
    scanf("%d", &o2.e1.ID);
    
    printf("Enter details of second employee of second Organization\n");
    scanf("%s", o2.e2.name);
    scanf("%ld", &o2.e2.salary);
    scanf("%d", &o2.e2.ID);
    
    printf("\nDetails of first Organization are %s %d", o1.name, o1.ID);
    printf("\nDetails of first employee of first Organization is %s %ld %d", o1.e1.name, o1.e1.salary, o1.e1.ID);
    printf("\nDetails of second employee of first Organization is %s %ld %d", o1.e2.name, o1.e2.salary, o1.e2.ID);
    
    printf("\nDetails of second Organization are %s %d", o2.name, o2.ID);
    printf("\nDetails of first employee of second Organization is %s %ld %d", o2.e1.name, o2.e1.salary, o2.e1.ID);
    printf("\nDetails of second employee of second Organization is %s %ld %d", o2.e2.name, o2.e2.salary, o2.e2.ID);

    return 0;
}
