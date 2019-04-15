import java.util.Scanner;

public class Tester
{
	   public static void main(String[] args) 
	    {
	
		   	//setting number and array
		    int num = 139248;
		    int [] array = {10,20,30,40};
		    
		    
		    
		    //Two constructors, one will reverse an int, the other will reverse an array
	    	Reverse a = new Reverse(num); 
	    	a.getVals();
	    	Reverse b = new Reverse(array);
	    	b.getArrayVals();


	    	
	    	
	    	Palindrome c = new Palindrome(num);
	    	c.checkPalindrome();
	    	
	    	Palindrome d = new Palindrome(array);
	    	d.checkPalindromeArr();
	    	
	    	
	    	
	    	
	    	
	    	//Note:
	    	//a.getNum(); >>>getters can't print anything

	    }

    

}