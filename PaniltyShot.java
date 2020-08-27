import java.util.Scanner;

public class PaniltyShot
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		String game = sc.next().trim();
		int chanceA = game.length()/2,chanceB = game.length()/2;
		int shotA=0,shotB = 0;
		
		int res = game.length();
		for(int i=0;i<game.length(); i++)
		{
			if(i%2==0)
			{
				shotA += (game.charAt(i)-'0');
				chanceA -=1;
			}else
			{
				shotB += (game.charAt(i)-'0');
				chanceB -=1;
			}
			
			if(shotA>chanceB+shotB)
			{
				//System.out.println();
				res =i+1;
				break;
			}else if(shotB>chanceA+shotA)
			{
				res = i+1;
				break;
			}
		}
		
		System.out.println(res);
	}
}