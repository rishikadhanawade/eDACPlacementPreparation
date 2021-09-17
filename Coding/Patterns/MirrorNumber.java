//    1
//   21
//  321
// 4321
//54321

package mypack;

public class MirrorNumber {

	public static void main(String[] args) {
		
		int n=5,a;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			a=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a--);
			}
			System.out.println();
		}
		
		
		

	}

}
