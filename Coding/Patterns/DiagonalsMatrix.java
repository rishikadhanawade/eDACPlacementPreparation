//1       1 
//  2   2   
//    3     
//  4   4   
//5       5 

package mypack;

import java.util.Scanner;

public class DiagonalsMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j||i+j==n+1)
					System.out.print(i+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}

