//*******
// *****
//  ***
//   *
//  ***
// *****
//*******

package mypack;

public class SandGlass {

	public static void main(String[] args) {
		
		int i,j,n=4;
	    //reversed pyramid
	    for(i=1;i<n;i++)
	    {
	        for(j=1;j<i;j++) //Increasing Space
	        System.out.print(" ");
	        for(j=i;j<n;j++) //Decreasing star we take j<n and not j<=n is because we want a overlapping 
	        // column for the current and next triangle so we reduce 1 column for the current one.
	        System.out.print("*");
	        for(j=i;j<=n;j++) //Decreasing star
	        System.out.print("*");
	        System.out.println();
	    }
	    //pyramid
	    for(i=1;i<=n;i++)
	    {
	        for(j=i;j<n;j++)  //decreasing space 
	        System.out.print(" ");
	        for(j=1;j<i;j++) //increasing star here we take j<i and not j<=i is because we want a overlapping 
	        // column for the current and next triangle so we reduce 1 column for the current one.
	        System.out.print("*");
	        for(j=1;j<=i;j++) //increasing star 
	        System.out.print("*");
	        System.out.println();
	    }

	}

}
