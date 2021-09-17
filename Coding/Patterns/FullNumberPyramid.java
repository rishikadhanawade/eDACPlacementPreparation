//        1 
//      2 3 2 
//    3 4 5 4 3 
//  4 5 6 7 6 5 4 
//5 6 7 8 9 8 7 6 5 

package mypack;

public class FullNumberPyramid {

	public static void main(String[] args) {

		int i,j,n=5,p;
	    for(i=1;i<=n;i++)
	    {
	    	p=i;
	        for(j=i;j<n;j++)  //decreasing space 
	        {
	            System.out.print("  ");
	        }
	        for(j=1;j<i;j++) //increasing star here we take j<i and not j<=i is because we want a overlapping 
	        // column for the current and next triangle so we reduce 1 column for the current one.
	        {
	            System.out.print((p++)+" ");
	        }
	        for(j=1;j<=i;j++) //increasing star 
	        {
	            System.out.print((p--)+" ");
	        }
	        System.out.println();
	    }
		

	 
	}

}
