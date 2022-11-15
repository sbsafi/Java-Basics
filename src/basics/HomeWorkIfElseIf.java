package basics;

import java.util.Scanner;

public class HomeWorkIfElseIf {

	public static void main(String[] args) {
		
		// calculate grades and assign letter
        // assign plus and minus as well
        // 90 - 100 A
        // 80 - 89 B
        // 70 - 79 C
        // 60 - 69 D
        // 0 - 59 F
        // in each category, if you pass 5, then add + if not add -
        // example 95 A+ 94 A-
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your grade here:");
        
		 int grade = scan.nextInt();


		 if (grade >= 95 && grade <= 100) {
		 System.out.println("A+" + " Congratulations");
		 } else if ( grade >= 90 && grade <= 94) {
		 System.out.println("A-");
		 } else if ( grade >= 85 && grade <= 89) {
			 
		 System.out.println("B+");
		 } else if (grade >= 80 && grade <= 84) {
		 System.out.println("B-");
		 } else if (grade >= 75 && grade <= 79) {
			 
		 System.out.println("C+");
		 } else if (grade >= 70 && grade <= 74 ) { 
		 System.out.println("C-");
		 }else if (grade >= 65&& grade <= 69) 
		
	     System.out.println("D+"); 
	     else if (grade >=60 && grade <= 64) {
	     System.out.println("D-");
	     
	     }else if (grade >= 0 && grade <=59) {
	     System.out.println(" Fail ." + " Khoda Zada. Shame on you study hard next time. ");
	     }
	    	 

	}

}
