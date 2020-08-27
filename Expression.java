
import java.util.*;
public class Expression
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		String exp = sc.next().trim();
		
		System.out.println(exp);
		System.out.println(correct(exp));
	}
	
	public static boolean correct(String exp)
	{
		if(exp.length()==0||exp==null)
			return true;
		
		var stack = new Stack<Character>();
		
		//boolean isRight = true;
		for(int i=0;i<exp.length(); i++)
		{
			//System.out.println(stack);
			char ch = exp.charAt(i);
			if(ch=='{'||ch=='['||ch=='('){
				stack.push(ch);
				//System.out.println(stack);
			}
			else if((ch=='}'&& stack.pop() != '{')||(ch==']'&&stack.pop()!='[')||(ch==')'&&stack.pop() != '('))
				return false;
			
			//System.out.println(stack);
		}
		
		return true;
	}
}