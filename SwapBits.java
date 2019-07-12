import java.util.Scanner;

public class SwapBits
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		
		int num = sc.nextInt();
		
		
		System.out.println("Original Number : "+BinaryToDecimal.toBinary(num));
		
		System.out.println("After Swapping : "+(num>>1));
		
		System.out.println("Resulted Number : "+BinaryToDecimal.toBinary(num>>1));
		
	}
}