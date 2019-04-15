public class Reverse
{
	
	private static int number; //need static because created constructor where reverse.number
	private static int rev;
	public static int OriginalArr[];
	private static int RevArr[];
	private static int n2;
	
	//Two constructors, one for int, one for array
	
	public Reverse(int num)
	{
		this.number = num;
		
		
		int reversed = 0;
		while(number != 0) 
		{
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        this.rev = reversed;
        this.number = num;
	}
	
	
	
	public Reverse(int arr[])
	{
		int n = arr.length;		
		int revArr[] = new int[n];
		
        int j = n; 
        for (int i = 0; i < n; i++) 
        { 
            revArr[j - 1] = arr[i]; 
            j = j - 1;   
        }
        
        
        n2= n;
        OriginalArr = arr;
        RevArr = revArr;
 
	}
	
	public static void getVals()
	{
		System.out.println("Original Number: " + number);
	    System.out.println("Reversed Number: " + rev);
	}
	
	public static void getArrayVals()
	{
		System.out.print("This is the Original Array: ");     
	        for (int z = 0; z <n2-1; z++)
	        {
	        	System.out.print(OriginalArr[z] + ",");
	        }
	        System.out.println(OriginalArr[n2-1]);        
	             
	        
	    System.out.print("This is the Reversed Array: ");
	        for (int z = 0; z <n2-1; z++)
	        {
	        	System.out.print(RevArr[z] + ",");
	        }
	        System.out.println(RevArr[n2-1]);
	}
	
	
	public int getNum()
	{
		return number;
	}
	
	public int getRev()
	{
		return rev;
	}
	
	public int[] getArray()
	{
		return OriginalArr;
	}
	
	public int[] getRevArr()
	{
		return RevArr;
	}
	
	
 
}