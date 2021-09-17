//* * * * * * * * * * * 
//  *               * 
//    *           * 
//      *       * 
//        *   * 
//          * 
package mypack;

public class HollowInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=6;
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<i;j++) //Increasing Space
	        {
	            System.out.print("  ");
	        }
	        for(j=i;j<n;j++) //Decreasing star we take j<n and not j<=n is because we want a overlapping 
	        // column for the current and next triangle so we reduce 1 column for the current one.
	        {	
	        	if(j==i||i==1)
	        		System.out.print("* ");
	        	else
	        		System.out.print("  ");
	        }
	        for(j=i;j<=n;j++) //Decreasing star
	        {
	        	if(i==1||j==n)
	        		System.out.print("* ");
	        	else
	        		System.out.print("  ");
	        }
	        System.out.println();
	    }
		
		
	}

}
