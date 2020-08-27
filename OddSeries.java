import java.util.*;

public class OddSeries
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the term ");
		int term = sc.nextInt();
		
		/*
			int first=0,nth = 0;
			for(int i=1; i<term; i++)
			{
				if(i%2==0){
					first +=2;
					nth = first;
				}
				else{
					nth = first/2;
				}
			}
		
		*/
		
		int res = 0;
		if(term%2==0&& term>0)
		{
			res = term/2 -1;
		}else if (term%2>0)
		{
			res = term-1;
		}
		System.out.println(res);
	}
}