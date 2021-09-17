class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2==1)
       {
           int mid=N/2;
           return A[mid];
       }
       else
       {
           int mid=N/2-1;
           return (A[mid]+A[mid+1])/2;
       }
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       int sum=0;
       for(int i=0;i<N;i++)
       {
           sum=sum+A[i];
       }
       return sum/N;
    }

}
