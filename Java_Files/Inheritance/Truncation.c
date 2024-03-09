#include<stdio.h>
int main()
{ int x,y;
    printf("Enter x value: ");
    scanf("%i",&x);
    printf("Enter y value: ");
    scanf("%i",&y);
    printf("%i",x/y);  //int divided by an int will always give an int no matter what
}