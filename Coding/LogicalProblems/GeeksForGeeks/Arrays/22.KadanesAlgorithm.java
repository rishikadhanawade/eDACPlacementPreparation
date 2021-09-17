// 22. Kadane's Algorithm 
// Medium Accuracy: 51.0% Submissions: 100k+ Points: 4
// Given an array arr of N integers. Find the contiguous sub-array with maximum sum.


// Example 1:

// Input:
// N = 5
// arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.
// Example 2:

// Input:
// N = 4
// arr[] = {-1,-2,-3,-4}
// Output:
// -1
// Explanation:
// Max subarray sum is -1 
// of element (-1)

// Your Task:
// You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes arr and N as input parameters and
//   returns the sum of subarray with maximum sum.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 ≤ N ≤ 106
// -107 ≤ A[i] ≤ 107



class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int maxSum=arr[0];
        int curSum=0;
        for(int i=0;i<arr.length;i++)
        {
            curSum=curSum+arr[i];
            if(curSum>maxSum)
            {
                maxSum=curSum;
            }
            if(curSum<0)
            {
                curSum=0;
            }
        }
        return maxSum;
        
    }
    
}
