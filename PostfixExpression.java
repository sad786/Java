import java.util.*;

public class PostfixExpression
{
	public static void main(String arg[])
	{
		var sc = new Scanner(System.in);
		String ex = sc.next().trim();
		var list = new ArrayList<Integer>();
		int i=0,top=-1;
		while(i<ex.length())
		{
			char c = ex.charAt(i++);
			if(c=='+'||c=='*'||c=='/'||c=='-')
			{
				int a = list.get(top--);
				int b = list.get(top--);
				int r =0;
				switch(c)
				{
					case '+':
						r = a+b;
						break;
					case '-':
						r = a-b;
						break;
					case '*':
						r = a*b;
						break;
					case '/':
						r = a/b;
						break;
					default:
						break;
				}
				list.add(++top,r);
			}
			else
			{
				int o = Integer.parseInt(c+"");
				list.add(++top,o);
			}
		}
		
		System.out.println("Evaluated result is "+list.get(top--));
	}
}