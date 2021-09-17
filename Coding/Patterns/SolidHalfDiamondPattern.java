//3 
//4 4 
//5 5 5 
//6 6 6 6 
//7 7 7 7 7 
//6 6 6 6 
//5 5 5 
//4 4 
//3 

package mypack;

public class SolidHalfDiamondPattern {

	public static void main(String[] args) {

		    int i,j,n=9;
		    int p=3;
		    int k=(int) Math.floor(n/2);
		    for(i=1;i<=k+1;i++)   //loop for rows
		    {
		        for(j=1;j<=i;j++)  //loop for columns
		        {
		            System.out.print(p+" ");
		        }
		        p++;
		        System.out.print("\n");  //for new line
		    }
		    p=p-2;
		    for(i=1;i<=k;i++)  
		    {
		        for(j=i;j<=k;j++) 
		        {
		            System.out.print(p+" ");
		        }
		        p--;
		    System.out.print("\n");  //for new line
		    }   
	
	}

}
