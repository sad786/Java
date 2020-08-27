import java.util.Scanner;
import java.util.ArrayList;
public class AntiDiaognals
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter size of the matrix");
		
		int size = sc.nextInt();
		
		int arr[][] = new int[size][size];
		
		System.out.println("Enter element row by row");
		
		for(int i=0;i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		int rowCount = 0;
		int last = 2*size-1;
		int row = 0,col = 0;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		while(rowCount<last)
		{
			res.add(new ArrayList<Integer>());
			int i = row,j = col;
			
			while(i<size&&j>=0)
			{
				res.get(rowCount).add(arr[i++][j--]);
			}
			
			rowCount +=1;
			
			if(rowCount>last/2)
				row +=1;
			else
				col +=1;
		}
		
		for(ArrayList<Integer> list:res)
			System.out.println(list);
	}

}
