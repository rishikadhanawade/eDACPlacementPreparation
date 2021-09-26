import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegative {

	public static int[] alternateposneg(int arr[])
	{
		List<Integer> pos=new ArrayList<Integer>();
		List<Integer> neg=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				pos.add(arr[i]);
			if(arr[i]<0)
				neg.add(arr[i]);
		}
		int array[]=new int[arr.length];
		int i=0,j=0,k=0;
		while(i<pos.size()&&j<neg.size())
		{
			array[k]=pos.get(i);
			k++;
			i++;
			array[k]=neg.get(j);
			k++;
			j++;
		}
		while(i<pos.size())
		{
			array[k]=pos.get(i);
			k++;
			i++;
		}
		while(j<neg.size())
		{
			array[k]=neg.get(j);
			k++;
			j++;
		}
		return array;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,-8,6,-98,12,-56,2};
		int[] array=alternateposneg(arr);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		

	}

}
