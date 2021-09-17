//        * 
//      *   * 
//    *       * 
//  *           * 
//* * * * * * * * * 

package mypack;

public class HollowPyramid {

	public static void main(String[] args) {
		int i,j,n=5;
	    for(i=1;i<=n;i++)
	    {
	        for(j=i;j<n;j++)  //decreasing space 
	        {
	            System.out.print("  ");
	        }
	        for(j=1;j<i;j++) //increasing star here we take j<i and not j<=i is because we want a overlapping 
	        // column for the current and next triangle so we reduce 1 column for the current one.
	        {
	            if(i>=2&&i<n)
	            {
	                if(j==1)
	                System.out.print("* ");
	                else
	                System.out.print("  ");
	            }
	            else
	            System.out.print("* ");
	        }
	         for(j=1;j<=i;j++) //increasing star 
	        {
	            if(i>=2&&i<n)
	            {   
	                if(j==i)
	                System.out.print("* ");
	                else
	                System.out.print("  ");
	            }
	            else
	            System.out.print("* ");
	        }
	        System.out.println();
	    }

	}

}
