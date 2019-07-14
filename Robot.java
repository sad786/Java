/*
	Imagine a robot sitting on the upper left hand corner of an NxN grid
	The robot can only move in two directions: right and down
	How many possible paths are there for the robot? 
*/

import java.util.Scanner;


public class Robot
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the matrix");
		
		int dimen = sc.nextInt();
		
		
		int paths = getPath(dimen,dimen);
		
		System.out.println(paths);
	}
	
	
	public static int getPath(int x,int y)
	{
		if(x<=1 || y<=1)
			return 1;
		
		return getPath(x-1,y) + getPath(x,y-1);
	}
}