// 7. Reverse array in groups 
// Basic Accuracy: 51.16% Submissions: 51179 Points: 1
// Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

// Example 1:

// Input:
// N = 5, K = 3
// arr[] = {1,2,3,4,5}
// Output: 3 2 1 5 4
// Explanation: First group consists of elements
// 1, 2, 3. Second group consists of 4,5.
 
// Example 2:

// Input:
// N = 4, K = 3
// arr[] = {5,6,8,9}
// Output: 8 6 5 9

// Your Task:
// You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the
//   array in-place. 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N, K ≤ 107
// 1 ≤ A[i] ≤ 1018

class Solution {
    //Function to reverse every sub-array group of size k.
    static void reverse(ArrayList<Integer> arr,int low,int high)
    {
        if(high>=arr.size())
            high=arr.size()-1;
        while(low<high)
        {
            int t=arr.get(low);
            arr.set(low,arr.get(high));
            arr.set(high,t);
            low++;
            high--;
        }
    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        
        for(int i=0;i<n;i=i+k)
        {
            reverse(arr,i,i+(k-1));
        }
        
    }
}
