
//* 
//  * 
//    * 
//      * 
//* * * * * 
//      * 
//    * 
//  *  
//* 
package mypack;
public class RightArrow {

	public static void main(String[] args) {

		    int i,j,n=9;
		    int k=(int) Math.floor(n/2);
		    for(i=1;i<=k;i++)   //loop for rows
		    {
		        for(j=1;j<=i;j++)  //loop for columns
		        {
		        	if(j<i&&i!=1)
		            System.out.print("  ");
		        	else
		        		System.out.print("* ");
		        }
		        System.out.print("\n");  //for new line
		    }
		    for(i=1;i<=k+1;i++)  
		    {
		        for(j=i;j<=k+1;j++) 
		        {
		        	if(j<k+1&&i!=1)
		            System.out.print("  ");
		        	else
		        		System.out.print("* ");
		        }
		    System.out.print("\n");  //for new line
		    }   
	
	}

}
