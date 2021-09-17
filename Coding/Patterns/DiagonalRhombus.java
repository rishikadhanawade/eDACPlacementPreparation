//        * 
//      * * * 
//    *   *   * 
//  *     *     * 
//* * * * * * * * * 
//  *     *     * 
//    *   *   * 
//      * * * 
//        * 
package mypack;
public class DiagonalRhombus {
	public static void main(String[] args) {
		int n = 5;
		   for (int i = 1; i < n; i++)
		   { //to get the overlapping row i is taken from 0 to n-1 (i<n)
		      for (int j = i; j < n; j++)
		      {
		         System.out.print("  "); // decreasing space
		      }
		      for (int j = 1; j < i; j++)
		      { // increasing
		    	 if(j==1)
		    		 System.out.print("* ");
		    	 else
		    		 System.out.print("  ");
		      }
		      for (int j = 1; j <= i; j++)
		      { // increasing
		    	 if(j==i||j==1)
		    		 System.out.print("* ");
		    	 else
		    		 System.out.print("  ");
		      }
		      System.out.println();
		   }
		   for (int i = 1; i <= n; i++)
		   {

		      for (int j = 1; j < i; j++)
		      { // increasing
		         System.out.print("  ");
		      }
		      for (int j = i; j < n; j++)
		      { // decreasing
		    	 if(j==i||i==1)
		    		 System.out.print("* ");
		    	 else
		    		 System.out.print("  ");
		      }
		      for (int j = i; j <= n; j++)
		      { // decreasing
		    	 if(j==n||i==1||j==i)
		    		 System.out.print("* ");
		    	 else
		    		 System.out.print("  ");
		      }
		      System.out.println();
		   }

	}
}
