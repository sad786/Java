import java.util.*;
import java.util.function.*;
public class Sqaure
{
	public static void main(String args[])
	{
		var list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		Function<Integer,Integer> getSquare =  num -> num*num;
		
		var sqList = new ArrayList<Integer>();
		
		for(Integer num:list)
			sqList.add(getSquare.apply(num));
		
		sqList.forEach(System.out::println);
	}
}