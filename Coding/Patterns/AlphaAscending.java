//A  
//B  F  
//C  G  J  
//D  H  K  M  
//E  I  L  N  O  

package mypack;

public class AlphaAscending {

	public static void main(String[] args) {
		
		
		int n=5,p;
		char c='A';
		for(int i=1;i<=n;i++)
		{
			p=c;
			c++;
			int q=4;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+"  ");
				p=p+q;
				q--;
			}
			System.out.println();
		}
		
		

	}

}
