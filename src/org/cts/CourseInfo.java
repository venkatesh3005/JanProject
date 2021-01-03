package org.cts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseInfo  {

	public static void main(String[] args)  {

	//Storing similar datatype using generics
		List<Integer> li=new LinkedList<>();
		
		li.add(25);
		li.add(50);
		li.add(70);
		li.add(50);
		li.add(90);
		li.add(80);
		li.add(100);
		
		System.out.println(li);
		
		//To find the length/size 
		int s = li.size();
		System.out.println("size of the list is "+s);

		//To find the index of a particular value
		
		int ind = li.indexOf(50);
		System.out.println("index of 50 is "+ind);
		
		//To fin dthe last index of a value
		
		int lin = li.lastIndexOf(50);
		System.out.println("last index of 50 is "+lin);
		
	}

	

}