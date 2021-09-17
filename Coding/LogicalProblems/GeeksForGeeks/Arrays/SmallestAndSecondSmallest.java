import java.util.ArrayList;

public class MinAndSecondMin {

	public static ArrayList<Integer> smallestAndSecondSmallest(int sizeOfArray, int arr[])
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int min=arr[0],smin=-1;
        for(int i=1;i<sizeOfArray;i++)
        {
            if(arr[i]<min)
                {
                    smin=min;
                    min=arr[i];
                }
            else if(arr[i]>min)
            {
                if(smin==-1||arr[i]<smin)
                    smin=arr[i];
            }
        }
       result.add(min);
       result.add(smin);
       return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {45,8,6,98,12,56,2};
		ArrayList<Integer> result=smallestAndSecondSmallest(arr.length,arr);
		System.out.println(result);
		
		
	}

}
