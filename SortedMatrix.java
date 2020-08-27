import java.util.Scanner;

public class SortedMatrix
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the matrix");
		
		int size = sc.nextInt();
		
		int arr[][] = new int[size][size];
		
		System.out.println("Enter element row by row");
		
		for(int i=0; i<size; i++)
		{
			//String list[] = sc.nextLine().split(" ");
			
			for(int j=0;j<size; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter element you want to search");
		
		int data = sc.nextInt();
		/*
			int rowlb = 0,rowub = size-1;
			while(rowlb<=rowub)
			{
				int mid = (rowlb+rowub)/2;
				if(data>=arr[mid][0] && data<=arr[mid][size-1])
				{
					int lb = 0;
					int ub = size-1;
					
					while(lb<=ub)
					{
						int m = (lb+ub)/2;
						if(arr[mid][m]==data)
						{
							System.out.println(+data+" is present at location "+(mid+1)+","+(m+1));
							System.exit(0);
						}else if(arr[mid][m]>data)	ub = m-1;
						else	lb = m+1;
					}
					break;
				}else if(data<arr[mid][0]) rowub = mid-1;
				else rowlb = mid+1;
			}
			
			System.out.println("Sorry! element is not present in the matrix");
			
		*/
		
		int row = 0,col = size-1;
		
		while(row<size && col>=0)
		{
			if(arr[row][col]==data)
			{
				System.out.println("Element is present at location Row "+(row+1)+", and Column "+(col+1));
				System.exit(0);
			}
			else if(arr[row][col]>data)
				col -=1;
			else row +=1;
			
		}
		
		System.out.println("Sorry! Element is not present in the list");
	}
}