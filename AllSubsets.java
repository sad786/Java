/*
	Write a method to returns all subsets of a set
	
*/


import java.util.Scanner;
import java.util.ArrayList;

public class AllSubsets
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		var set = new ArrayList<Integer>();
		System.out.println("Enter how many elements are there ");
		int n = sc.nextInt();
		System.out.println("Enter elements into the set");
		
		while(n>0)
		{
			set.add(sc.nextInt());
			n -=1;
		}
		
		ArrayList<ArrayList<Integer>> subsets = AllSubsets.getSubsets(set,0);
		
		System.out.println(subsets);
	}
	
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index)
	{
		ArrayList<ArrayList<Integer>> finalSet;
		if(index==set.size())
		{
			finalSet = new ArrayList<ArrayList<Integer>>();
			finalSet.add(new ArrayList<Integer>());
		}
		else{
			
			finalSet = getSubsets(set,index+1);
			int item = set.get(index);
		
			ArrayList<ArrayList<Integer>> tempSet = new ArrayList<ArrayList<Integer>>();

			for(ArrayList<Integer> subset: finalSet)
			{
				ArrayList<Integer> itemSet = new ArrayList<Integer>();
			
				itemSet.addAll(subset);
				itemSet.add(item);
				tempSet.add(itemSet);
				//itemSet.clear();
			}
			
			finalSet.addAll(tempSet);
		
		}
		
		return finalSet;
	}	
}