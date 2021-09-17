//*****
// *****
//  *****
//   *****
//    *****
package mypack;

public class BoxTypeParallelogram2 {

	public static void main(String[] args) {
		
		int n=5;
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
