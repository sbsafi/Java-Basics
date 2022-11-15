package basics;

public class ShapesWithStars {

	public static void main(String[] args) {
		
		
		 
		 int size = 4;
	        int number = 1;
	        // *
	        // * *
	        // * * *
	        // * * * *
	        // * * * * *
	        for (int i = 1; i <= size; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(number++ + "\t");
	            }
	            System.out.println();
	            System.out.println();
	        }
	        for (int i = size - 1; i > 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(number++ + "\t");
	            }
	            System.out.println();
	            System.out.println();
	        }
	        // * * * *
	        // * * *
	        // * *
	        // *
	}

}
