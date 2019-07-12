/*

	* write a function to determine
	* how many bits required to convert an Integer A to Integer B
	* example input 
	* A = 31
	* B = 14
	* output = 2
	
*/



import java.util.Scanner;

public class BitsRequired
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int first = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		int second = sc.nextInt();
		
		String firstBin = Largest.toBinary(first);
		String secondBin = Largest.toBinary(second);
		
		int res = Math.abs(firstBin.length()-secondBin.length());
		
		for(int index = 0; index<firstBin.length() && index<secondBin.length(); index++)
		{
			if(firstBin.charAt(index) != secondBin.charAt(index))
				res +=1;
		}
		
		System.out.println("Total Number of Bits Required is "+res);
	}
}