class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(a.length()!=b.length())
            return false;
            
        char arr1[]=a.toCharArray();
        Arrays.sort(arr1);
        a=new String(arr1);
        char arr2[]=b.toCharArray();
        Arrays.sort(arr2);
        b=new String(arr2);
        return a.equals(b);
        
    }
}
