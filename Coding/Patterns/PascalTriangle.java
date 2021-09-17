// Print Pascal's Triangle in Java
//    1 
//   1 1 
//  1 2 1 
// 1 3 3 1 
//1 4 6 4 1 

package mypack;
import java.io.*;

public class PascalTriangle {
	public static int factorial(int i)
	{
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
		int n = 4, i, j;
		for (i = 0; i <= n; i++) {
			for (j = i-1; j<n-1; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (j=0;j<=i;j++) {

				// nCr formula
				System.out.print(
					+ factorial(i)
						/ (factorial(i - j)
							* factorial(j))
						+" ");
			}

			// for newline
			System.out.println();
		}
	}
}
