//1 
//3 2 
//4 5 6 
//10 9 8 7 
//11 12 13 14 15 
package mypack;
public class IncrementAlasce {

	public static void main(String[] args) {
		
		int n=5;
		int p=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				p=p+i;
				for(int j=1;j<=i;j++)
				{
					System.out.print((p--)+" ");
				}
				p=p+i;
			}
			if(i%2==1)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print((++p)+" ");
				}
			}
			System.out.println();
		}
	}

}
