import java.util.Scanner;
public class Knapsack
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("How many Objects do you have?");
		int n = sc.nextInt();
		
		int obj[] = new int[n];	// this array hold the objects
		int weight[] = new int[n];	// this array will hold the weight of each object
		float profit[] = new float[n];	// this array will hold the profit of each object
		float pw[] = new float[n];
		float cw[] = new float[n];
	
		System.out.println("Enter objects one by one");
		for(int i=0;i<n; i++)
			obj[i] = sc.nextInt();
		
		System.out.println("Enter Weights of each object");
		for(int i=0;i<n; i++)
			weight[i] = sc.nextInt();
		
		System.out.println("Enter Profits of each object");
		for(int i=0;i<n; i++)
			profit[i] = sc.nextFloat();
		
		System.out.println("Please Enter size of the container");
		int size = sc.nextInt();
		if(size<0)
			throw new IllegalArgumentException("Invalid Argument");
		
		// here i am using approach such that i will consider object first which have profit by weight maximum
		for(int i=0;i<n; i++)
			pw[i] =	profit[i]/weight[i];
		
		while(size>0)
		{
			int maxIndex = giveMax(pw);
			pw[maxIndex] = 0.0f;
			if(weight[maxIndex]<=size)
			{
				size-=weight[maxIndex];
				cw[maxIndex]=1;
			}
			else
			{
				cw[maxIndex] = size/(float)weight[maxIndex];
				size=0;
			}
		}
		float maxProfit = 0.0f;
		for(int i=0;i<n; i++)
		{
			maxProfit+=cw[i]*profit[i];
		}
		System.out.println("Maximum profit for this is "+Math.ceil(maxProfit));
	}
	
	public static int giveMax(float arr[])
	{
		float max = 0;
		int maxIn = 0;
		for(int i=0;i<arr.length; i++){
			if(arr[i]>max){
					maxIn = i;
					max = arr[i];
				}
		}
	
		return maxIn;
		
	}
}