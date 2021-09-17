#include <stdio.h>
void printArray(int *A,int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",A[i]);
    }
    printf("\n");
} 
int sumArray(int *A,int n)
{
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+A[i];
    }
    return sum;
}
int main()
{
    int a[5]={3,4,5,6,7};
    int n=5;
    printArray(a,n);
    int sum=sumArray(a,n);
    printf("Sum of Array is: %d",sum);
    return 0;
}