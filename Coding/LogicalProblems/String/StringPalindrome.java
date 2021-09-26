
public class StringPalindrome {

	public static void main(String[] args) {

		String s1="rishika";
		int i=0,j=s1.length()-1;
		int flag=0;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				System.out.println("Not palindrome");
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==0)
		System.out.println("Palindrome");
	}

}
