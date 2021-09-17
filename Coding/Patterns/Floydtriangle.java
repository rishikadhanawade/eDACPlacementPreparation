//1
//01
//101
//0101
//10101
package mypack;

public class Floydtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,n=5;
		 for(i=1;i<=n;i++)
		 {
		     for(j=i;j>=1;j--)
		     System.out.print(j%2);
		     System.out.print("\n");
		 }

	}

}

