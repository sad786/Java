import java.util.*;
public class SubSet
{
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = null;
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("How many Elements you will enter");
		int n = sc.nextInt();
		System.out.println("Enter Elements");
		list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<n; i++){
			list.add(sc.nextInt());
			sum+=list.get(i);
		}
		System.out.println("Enter the target value");
		int target = sc.nextInt();
		if(sum<target){
			System.out.println("Solution is not possible");
			System.exit(0);
		}
		
		subset(list,sum,target);
		
		for(var l:res){
			for(int e:l){
				System.out.print(e+ "");
			}
			System.out.println();
		}
	}
	
	private static void subset(int obj,int sum,int target,int index)
	{
		if(obj>target||sum==0||index==list.size()-1)
			return;
		else
			
		subset(obj+list.get(index),sum-list.get(index),target,index);
		subset(obj+list.get(index),sum-list.get(index),target,index);
		
		
	}
}