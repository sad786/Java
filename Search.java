import java.util.Scanner;

public class Search
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the list");
		
		int size = sc.nextInt();
		
		System.out.println("Enter the elements into the list");
		
		int list[] = new int[size];
		
		for(int i=0;i<size; i++){
			list[i] = sc.nextInt();
			System.out.println("Hello");
		}
		
		
		System.out.println("Enter element you want to search");
		int data = sc.nextInt();
		
		int lb  = 0,ub=size-1;
		
		while(lb<=ub)
		{
			int m  = (lb+ub)/2;
			
			if(data==list[m])
			{
				System.out.println(data+" is present at location "+(m+1));
				return;
			}
			else if(list[lb]<=list[m])
			{
				if(data>list[m])
					lb = m+1;
				else if(data>=list[lb])
					ub = m-1;
				else
					lb = m+1;
			}else if(data<list[m])
				ub = m-1;
			else if(data<=list[ub])
				lb = m+1;
			else
				ub = m-1;
		}
		
		System.out.println("Sorry! element is not present in the list");
	}
}