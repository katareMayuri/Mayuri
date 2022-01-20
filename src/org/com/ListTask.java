package org.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTask {
	public static void main(String[] args) {
		//declaring the list
		List<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(50);
		li.add(30);
		li.add(60);
		
		//declaring another list
		//List<Integer>li1=new LinkedList<Integer>();
		//li1.add(50);
		//li1.add(60);
		//li1.add(70);
		
		
		//size of the list
		
		int siz = li.size();
		System.out.println(siz);
		
		//get value from particular index
		
		//Integer value = li.get(3);
		//System.out.println(value);
		
		//print the list
		
		System.out.println(li);
		//System.out.println(li1);
		
		//to add the value to particular index
		//li.add(1, 15);
		//System.out.println(li);
		
		//to remove the value from particular index
		//li.remove(0);
		//System.out.println(li);
		
	
	
	}
}
