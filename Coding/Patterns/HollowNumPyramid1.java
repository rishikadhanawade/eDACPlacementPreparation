//    1 
//   2 2 
//  3   3 
// 4     4 
//5 5 5 5 5 

package mypack;

public class HollowNumPyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==n||j==1||j==i)
				System.out.print(i+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
