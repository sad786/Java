import java.util.Scanner;
public class Guess
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			
			process(sc,A+1,B,N);
			T -=1;
		}
	}
	
	public static void process(Scanner sc, int A,int B,int N)
	{
		while(N>0)
		{
			int mid = (A+B)/2;
			System.out.print(mid);
			String r = sc.next();
			if(r.equals("CORRECT"))
			{
				return;
			}else if(r.equals("TOO_SMALL"))
			{
				A = mid+1;
			}else if(r.equals("TOO_BIG"))
			{
				B = mid-1;
			}else if(r.equals("WRONG_ANSWER"))
			{
				System.exit(0);
			}
			N -=1;
		}
	}
}