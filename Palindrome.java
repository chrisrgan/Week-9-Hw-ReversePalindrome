import java.util.Arrays;
public class Palindrome extends Reverse
{
	
	public Palindrome(int num) {
		super(num);
	}

	public Palindrome(int arr[])
	{
		super(arr);
	}

	
	public void checkPalindrome()
	{
		if ((getNum() == getRev()))
		{
			System.out.println("True: Number is Palindrome");
		}
		else
		{
			System.out.println("False: Number is not Palindrome");
		}	
	}
	
	public void checkPalindromeArr()
	{
		if (Arrays.equals(getArray(), getRevArr()))
		{
			System.out.println("True: Array is Palindrome");
		}
		else
		{
			System.out.println("False: Array is not Palindrome");
		}
		
	}
	
	
	

	

}