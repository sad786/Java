/*
	* Given an integer number print the next smallest
	* and next biggest integer number 
	* which has same number of 1 bit of original number
*/

import java.util.*;

public class Largest
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		
		int num = sc.nextInt();
		
		int res[] = process(num);
		
		System.out.println("Next Largest is "+res[0]+" and Next Smallest is "+res[1]);
		
	}
	
	public static int[] process(int num)
	{
		
		if(num==0)
			return new int[]{0,0};
		
		String binNum = toBinary(num);
		
		int totalOne = binNum.length() - binNum.replaceAll("1","").length();
		
		int temp = num -1;
		
		while(true)
		{
			String tempBin = toBinary(temp);
			
			int one = tempBin.length() - tempBin.replaceAll("1","").length();
			
			if(one==totalOne)
				break;
			
			temp -=1;
		}
		
		int smallest = temp;
		
		temp = num +1;
		
		while(true)
		{
			String tempBin = toBinary(temp);
			
			int one = tempBin.length() - tempBin.replaceAll("1","").length();
			
			if(one==totalOne)
				break;
			
			temp +=1;
		}
		
		int largest = temp;
		
		return new int[]{smallest,largest};
	}
	
	
	public static String toBinary(int num)
	{
		num = Math.abs(num);
		StringBuilder bin = new StringBuilder();
		
		while(num>0)
		{
			bin.insert(0,num%2);
			num /= 2;
		}
		
		return bin.toString();
	}
}