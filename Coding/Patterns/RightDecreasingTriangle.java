//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 
package mypack;

public class RightDecreasingTriangle {

	public static void main(String[] args) {
		
		
		int i, j, n = 5;
	    for (i = 1; i <= n; i++)
	    {
	        for (j = 1; j < i; j++) //loop for increasing triangle of space
	        {
	            System.out.print("  ");
	        }
	        for (j = i; j <= n; j++) //loop for decreasing traingle of stars.
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
