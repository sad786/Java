import java.util.Scanner;
public class HourGlass
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		int arr[][] = new int[6][6];
		
		for(int i=0;i<6; i++)
			for(int j=0; j<6; j++)
				arr[i][j] = sc.nextInt();
			
		
		
		int large = Integer.MIN_VALUE;
		int cl = 0;
		for(int i=0;i<=3; i++)
		{
			for(int col = 0; col<=3; col++){
				int rowCount = 0;
				int tempSum = 0;
				for(int r = i; rowCount<3; rowCount++,r++)
				{
					int colCount = 0;
					for(int c = col;colCount<3; c++,colCount++)
					{
						if(!(r%2!=0 && c%2==0))
						{
							tempSum += arr[r][c];
						}
					
					}
					
				}
				if(tempSum>large)
					large = tempSum;
				
			}
			cl = 0;
		}
		
		System.out.println(large);
	}
}