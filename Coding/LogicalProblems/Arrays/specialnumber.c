#include<stdio.h>
int factorial(int n)
{
    int fact=1;
    for(int i=n;i>1;i--)
    {
        fact=fact*i;
    }
    return fact;
}
int isspecial(int i)
{
   int num=i,d;
   int sum=0;
   while(num!=0)
   {
       d=num%10;
       sum=sum+factorial(d);
       num=num/10;
   }
   if(sum==i)
   return 1;
   return 0;
}
int main()
{   
    int b;
    printf("Special numbers are \n");
    for(int i=1;i<=200000;i++)
    {
        b=isspecial(i);
        if(b==1)
        printf("%d ",i);
    }
    return 0;
}