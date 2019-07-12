import java.util.*;

public class Series
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the total terms:");
		int terms = sc.nextInt();
		
		System.out.println("Enter the common ration of GP-1");
		int r1 = sc.nextInt();
		
		System.out.println("Enter the common ratio of GP-2");
		int r2 = sc.nextInt();
		
		System.out.println("The Series is ");
		int a = 1,b = 1;
		
		int end = (terms%2==0)?(terms/2):(terms/2+1);		
		System.out.println(end);
		for(int i=0;i<end; i++)
		{
			System.out.print(a+" ");
			a = a*r1;
			if(i<terms/2){
				System.out.print(b+" ");
				b = b*r2;
			}
		}
	}
}