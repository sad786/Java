import java.util.*;


public class LeapYear
{
	public static void main(String args[])
	{
		
		var sc = new Scanner(System.in);
		System.out.println("Enter any year:");
		int year = sc.nextInt();
		
		if(isLeap(year))
			System.out.println(year+" is Leap Year");
		else
			System.out.println("No "+year+"  is not Leapy Year");
	}
	
	public static boolean isLeap(int year)
	{
		return (year%400==0) || ((year%4==0) && (year%100!=0));
	}
}