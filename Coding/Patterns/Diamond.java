//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
package mypack;
public class Diamond {
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
		    		 System.out.print("* ");
		      }
		      for (int j = 1; j <= i; j++)
		      { // increasing
		    	 System.out.print("* ");
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
		    		 System.out.print("* ");
		      }
		      for (int j = i; j <= n; j++)
		      { // decreasing
		    		 System.out.print("* ");
		      }
		      System.out.println();
		   }

	}
}
