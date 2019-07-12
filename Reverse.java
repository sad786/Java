import java.util.Scanner;
import java.io.*;
public class Reverse
{
	public static void main(String args[])throws Exception
	{
		var sc = new BufferedReader(new InputStreamReader(System.in));
		
		var st = new StringBuffer(sc.readLine());
		st.insert(st.length(),' ');
		
		int w=0;
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)==' ')
			{
				swap(w,i-1,st);
				w = i+1;
			}
		}
		//st.insert(st.length(),"");
		for(int i=0,j=st.length()-2;i<j; i++,j--)
		{
			char c = st.charAt(i);
			st.setCharAt(i,st.charAt(j));
			st.setCharAt(j,c);
		}
		System.out.println(st);
		
	}
	
	private static void swap(int i,int j,StringBuffer sb)
	{
		while(i<j)
		{
			char c = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j,c);
			i +=1;
			j -=1;
		}
	}
}