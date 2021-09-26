
public class RotateRL {
	
	static void leftrotatebyone(int array[])
	{
		int j=0,i=array.length-1;
		while(i!=j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i--;
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
	}
	static void rightrotatebyone(int array[])
	{
		int i=0,j=array.length-1;
		while(i!=j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
	}
	public static void reverse(int arr[])
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6};
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		//leftrotatebyone(arr);
		reverse(arr);
		System.out.println();
		//rightrotatebyone(arr);
	}

}
