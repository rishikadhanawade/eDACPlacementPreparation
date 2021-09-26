
public class Segregate012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,1,2,1,0,0,1,2,0,1,0,2};
		for (int s = 0; s < nums.length; s++) {
			System.out.print(nums[s]+" ");
		}
		System.out.println();
		int count0=0,count1=0;
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]==0)
				count0++;
			if(nums[i]==1)
				count1++;
		}
		for (int i = 0; i < count0; i++) {
			
			nums[i]=0;
		}
		for (int i = count0; i < (count0+count1); i++) {
			
			nums[i]=1;
		}
		for (int i = (count0+count1); i < nums.length; i++) {
			
			nums[i]=2;
		}
		for (int s = 0; s < nums.length; s++) {
			System.out.print(nums[s]+" ");
		}
	}

}
