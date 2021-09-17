//ABCDE
//BCDE
//CDE
//DE
//E


package mypack;

public class LetterDescending {

	public static void main(String[] args) {
		

		for(char i='A';i<='E';i++)
		{
			for(char j=i;j<='E';j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}	

	}

}
