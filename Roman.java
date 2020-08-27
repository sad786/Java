import java.util.Scanner;

public class Roman
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Number:");
		
		int num = sc.nextInt();
		
		System.out.println("Roman Equivalent is "+intToRoman(num));
	}
	
	public static String intToRoman(int num)
	{
		String one[] = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String ten[] = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hund[] = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thou[] = new String[]{"","M","MM","MMM"};
		
		
		return thou[num/1000]+hund[(num%1000)/100]+ten[(num%100)/10]+one[num%10];
	}
}