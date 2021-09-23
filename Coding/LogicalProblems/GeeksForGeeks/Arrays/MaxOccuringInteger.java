
public class MaxOccuringInteger {

	public static void main(String[] args) {
		
		int arr[]= {2,4,2,1,4,2,3,5,6,7,3,2,4,4,4,7,7,7,7,7};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		int count[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]=count[arr[i]]+1;
		}
		max=count[0];
		int maxElement=0;
		for(int i=0;i<count.length;i++)
		{
			if(max<count[i])
			{
				max=count[i];
				maxElement=i;
			}
		}
	System.out.println("Maximum Occured Integer: "+maxElement);
//		

	}

}
