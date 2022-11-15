package basics;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> names2 = new ArrayList<String>();
		
		
		


	       // adding to the list
	        names2.add("Jack");
	        names2.add("David");
	        names2.add("Anna");
	        
	        // to get the length of your list, use method size()
	        System.out.println("method size() "+names2.size());
	        
	        // to get one index from your list, use the method get(index)
	        System.out.println("method get(0) "+names2.get(0));
	        
	        // to print the arraylist, you can simple print the list. or go through with a loop
	        System.out.println(names2);
	        
	        for (int i = 0; i < names2.size(); i++) {
	            System.out.println(names2.get(i));
	        }
		
		
		
		
		
		
		
		
//	        String[] names = { "Jack", "David", "Anna" };
//	        // data type of names? array of String
//	        // data type of elements inside the array? String
	//
//	        // advantages
//	        // fast
//	        // you can have empty indexes
	//
//	        // disadvantage
//	        // fixed size / can not change the size
//	        // arrays do not have methods, so you need to code any operation that you wanna
//	        // use
//	        
//	        
//	        
//	        // advantages of arraylist
//	        // dynamic in size
//	        // it has pre-developed functions that you can use
//	        // generics in java <reference data type>
//	        ArrayList<String> names2 = new ArrayList<String>();
	//
//	        // adding to the list
//	        names2.add("Jack");
//	        names2.add("David");
//	        names2.add("Anna");
//	        
//	        // to get the length of your list, use method size()
//	        System.out.println("method size() "+names2.size());
//	        
//	        // to get one index from your list, use the method get(index)
//	        System.out.println("method get(0) "+names2.get(0));
//	        
//	        // to print the arraylist, you can simple print the list. or go through with a loop
//	        System.out.println(names2);
//	        
//	        for (int i = 0; i < names2.size(); i++) {
//	            System.out.println(names2.get(i));
//	        }
	        
	        
	        
	        ArrayList<String> names = new ArrayList<String>();
	        // you must use reference data type inside of < >
	        // ctrl + shift + o == import manager
	        
	        names.add("jack1");
	        names.add("jack2");
	        names.add("jack3");
	        names.add("jack4");
	        
	        
	        System.out.println(names.get(2));
	        
	        System.out.println(names);
	        
	        System.out.println(names.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
