import java.util.Scanner;
public class Sorting
{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int size = Integer.parseInt(input("Please Enter Size of the array:"));
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = Integer.parseInt(input("Enter element "+(i+1)));
		
		
		for(int i=0; i<size; i++)
		{
			boolean flag = true;
			for(int j=i; j>0; j--){
				if(arr[i]==arr[j-1]){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(" "+arr[i]);
		}
	}
	
	public static String input(String msg)
	{
		System.out.println(msg);
		return sc.next().trim();
	}
	
	public static String input()
	{
		return sc.next().trim();
	}
}