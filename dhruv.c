#include<stdio.h>
#include<stdlib.h>
#define Max 10
void main()
{
    char *stk1[Max],stk2[Max],c1,c2;
    int i;
    for(i=0;*stk1[i]!='NULL';i++)
    {
        scanf("%c",&c1);
        push(&stk1,c1);
    }
    for(i=0;stk2[i]!='NULL';i++)
    {
        c2=pop(stk1);
        push(&stk2,c2);
    }
    for(i=0;*stk1[i]!='NULL';i++)
    {
        if(stk1[i]==stk2[i])
            printf("PALINDROME");
        else
            printf("NOT PALINDROME");
    }
}
void push(char *stck[Max],char x)
{
    int top=-1;
    if(top==Max-1)
    {
        printf("Overflow");
        return;
    }
    top++;
    *stck[top]=&x;
}
char pop(char stck1[Max])
{
    int top=Max-1;
    char x;
    if(top==-1)
    {
        printf("Underflow");
        return;
    }
    top--;
    x=*stck1[top];
    return(x);
}

