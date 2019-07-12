import java.util.*;

public class RotateMatrix
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columsn of the matrix");
		
		String num[] = sc.nextLine().split(" ");
		
		int arr[][] = new int[Integer.parseInt(num[0])][Integer.parseInt(num[1])];
		
		System.out.println("Enter data row by row");
		for(int i=0;i<arr.length; i++)
		{
			num = sc.nextLine().split(" ");
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = Integer.parseInt(num[j]);
			}
		}
		
		arr = rotate(arr);
		System.out.println("After rotating 90 degree the matrix is ");
		
		for(int a[]:arr)
		{
			for(int e:a)
				System.out.print(e+" ");
			
			System.out.println();
		}
	
	}
	
	public static int[][] rotate(int arr[][])
	{
		int res[][] = new int[arr[0].length][arr.length];
		
		int n = arr.length;
		for(int row=0; row<arr[0].length; row++)
		{
			
			for(int col=n-1,c=0; col>=0; col--,c++)
			{
				res[row][c] = arr[col][row];
			}
		}
		
		return res;
	}
}