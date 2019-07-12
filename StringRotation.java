import java.util.Scanner;
public class StringRotation
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(sc.nextLine());	// this will real data from console and store it in the str variable
		
		int q = sc.nextInt();
		StringBuilder res = new StringBuilder();
		for(int i=1; i<=q; i++)
		{
			String dir = sc.next();
			int pos = sc.nextInt();
			res.append(rotate(str,dir,pos));
		}
		
		System.out.println(res+"==="+str);
	}
	
	private static char rotate(StringBuilder st,String direction,int not)
	{
		if(direction.equals("L"))
		{
			while(not>0)
			{
				char c = st.charAt(0);
				st.deleteCharAt(0);
				st.append(c);
				not -=1;
			}
		}else if (direction.equals("R"))
		{
			while(not>0)
			{
				char c = st.charAt(st.length()-1);
				st.deleteCharAt(st.length()-1);
				st.insert(0,c);
				not -=1;
			}
		}
		//System.out.println(st);
		return st.charAt(0);
	}
}