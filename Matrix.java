import java.util.*;
public class Matrix
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the size of matrix");
		
		String num[] = sc.nextLine().split(" ");
		
		int row = Integer.parseInt(num[0]),col = Integer.parseInt(num[1]);
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter elements into matrix row by row");
		
		for(int i=0; i<row; i++)
		{
			num = sc.nextLine().split(" ");
			
			for(int j=0;j<col; j++)
			{
				arr[i][j] = Integer.parseInt(num[j]);
			}
		}	
		
		System.out.println("After doing operation");
		
		for(int []e:arr)
		{
			for(int s:e)
				System.out.print(s+" ");
			
			System.out.println();
		}
	}
	
	public static void process(int matrix[][])
	{
		for(int row=0;row<matrix.length; row++)
		{
			for(int col=0;col<matrix[row].length; col++)
			{
				if(matrix[row][col]==0)
				{
					for(int c=0;c<matrix[row].length; c++)
					{
						matrix[row][c] = 0;
					}
					break;
				}
			}
		}
	}
}