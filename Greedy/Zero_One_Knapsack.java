import java.util.*;

class Knapsack01
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter how many objects do you have?");
		int n = sc.nextInt();
		int pr[] = new int[n];
		int wt[] = new int[n];
		System.out.println("Enter capacity of the Bag");
		int c = sc.nextInt();
		int v[][] = new int[n+1][c+1];
		System.out.println("Enter weight and profit one by one");
		for(int i=0;i<n; i++)
		{
			wt[i] = sc.nextInt();
			pr[i] = sc.nextInt();
		}
		for(int i=0;i<v.length; i++)
		{
			v[i][0] = 0;
		}
		for(int i=0;i<v[0].length; i++)
		{
			v[0][i] = 0;
		}
		for(int i=1;i<v.length; i++)
		{
			for(int j=1; j<v[0].length; j++)
			{
				try{
					v[i][j] = Math.max(v[i-1][j],v[i-1][j-wt[i-1]]+pr[i-1]);
				}catch(ArrayIndexOutOfBoundsException e)
				{
					v[i][j] = v[i-1][j];
				}
			}
		}
		System.out.println("Maximum profit is "+(v[v.length-1][v[0].length-1]));
		for(int p:pr)
			System.out.print(p+" ");
		System.out.println();
		for(int w:wt)
			System.out.print(w+" ");
		for(int i=0;i<v.length; i++)
		{
			for(int j=0;j<v[0].length; j++)
			{
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}