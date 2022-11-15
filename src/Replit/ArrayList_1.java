package Replit;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {

	public static void main(String[] args) {
		
//		Steps
		
		
//		add colors in ArrayList [Red, Green, Black, White, Pink, Yellow]
//		print ArrayList
//		Expected Output
//		[Red, Green, Orange, White, Black]
		

		   ArrayList<String> list_Strings = new ArrayList<String>();
				  list_Strings.add("Red");
				  list_Strings.add("Green");
				  list_Strings.add("Orange");
				  list_Strings.add("White");
				  list_Strings.add("Black");
				  System.out.println(list_Strings);
				  
				  ArrayList<String> sub_ArrayList = new ArrayList<String>(list_Strings.subList(0, 5));
				  System.out.println(sub_ArrayList);
				  
				  
	}

}
