import java.util.*;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> s1=new HashSet<Integer>();
		int nums[]= {1,2,3,4,5,6,7,8,8};
		int i,flag=0;
		for (i = 0; i < nums.length; i++) {
			
			if(s1.contains(nums[i]))
			{
				flag=1;
				System.out.println("true");
				break;
			}
			else
			{
				s1.add(nums[i]);
			}
		}
		if(flag==0)
		{
			System.out.println("false");
		}
			
	}
}
