package org.com;

import java.util.ArrayList;
	import java.util.Arrays;
	  
	public class ArrayTask1 {
		
		public static ArrayList<Integer> testArray(ArrayList<Integer> list){
		       
	    	ArrayList<Integer> newList = new ArrayList<Integer>();

	        for (Integer element : list) {
	            if ( newList.contains(element)) {
	  
	                continue;
	            }
	            else
	            {
	            	newList.add(element);
	            }
	            	
	        }
	  
	        return newList;
		}
	  
	  
	    public static void main(String args[])
	    {
	  
	        ArrayList<Integer>list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(2);
	        list.add(3);
	        
	        //System.out.println("ArrayList with duplicates: "+ list);
	        
	        ArrayList<Integer>newList = testArray(list);   
	        System.out.println(newList);
	    }

	    }
	    

