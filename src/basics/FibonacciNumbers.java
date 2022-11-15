package basics;

import java.util.ArrayList;

public class FibonacciNumbers {

	public static void main(String[] args) {
	
		
		// fib numbers
        // we start with values of 0 and 1
        // then, every next number is the sum of the two previous numbers
        
        int count = 10;
        // creating a list to keep the fib numbers
        ArrayList<Integer> fibNums = new ArrayList<Integer>();
        // adding the first two values in the list
        fibNums.add(0);
        fibNums.add(1);
        for (int i = 0; i < count-2; i++) {
            // getting the two previous indexes and adding them
            int sum = fibNums.get(i) + fibNums.get(i+1);
            // adding the new fib num to the list
            fibNums.add(sum);
        }
        // printing the list of fib numbers
        System.out.println(fibNums);
		
		
		
		
		
		
		
		
		
		// second way 
        
        
       ArrayList<Integer> nums = new ArrayList<Integer>();
       nums.add(0);
       nums.add(1);
      

        for (int count1 = 0; count1 < 10; count1++) {
    	nums.add(nums.get(nums.size() - 1) + nums.get(nums.size() - 2));
    	}
        System.out.println(nums);


		

	}

}
