package basics;

public class DimentionExamples {

	public static void main(String[] args) {
		
		 //
        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        int[][] numbers = new int[3][4];
        numbers[0][0] = 10;
        numbers[0][1] = 15;
        numbers[0][2] = 20;
        numbers[0][3] = 25;
        // data-type (number of dimensions [][][] = 3 dimension)
        // identifier of the variable = initialize
        // [row][col]
        // [5][3]
        // multiple of a same datatype variable is one dimension = row
        // multiple of 1-dimension is 2-dimension
        // multiple of 2-dimension is 3-dimension
        // 10, 52, 3
        // 10, 52, 3
        // 10, 52, 3
        // 10, 52, 3
        // 10, 52, 3
        // creating an 2D array of int
        // size is 3 rows and 4 cols
        int[][] num2D = new int[3][4];
        // assigning values to the first row
        num2D[0][0] = 1;
        num2D[0][1] = 2;
        num2D[0][2] = 3;
        num2D[0][3] = 4;
        // assigning values to the second row
        num2D[1][0] = 5;
        num2D[1][1] = 6;
        num2D[1][2] = 7;
        num2D[1][3] = 8;
        // assigning values to the third row
        num2D[2][0] = 9;
        num2D[2][1] = 10;
        num2D[2][2] = 11;
        num2D[2][3] = 12;
        // 1, 2, 3, 4
        // 5, 6, 7, 8
        // 9, 10, 11, 12
        System.out.println("num2D.length  " + num2D.length);
        System.out.println("num2D[0].length  " + num2D[0].length);
        for (int row = 0; row < num2D.length; row++) {
            for (int col = 0; col < num2D[row].length; col++) {
                System.out.print("(" + row + ", " + col + ") ==>> ");
                System.out.print(num2D[row][col] + ", ");
            }
            System.out.println();
      
        
        }
        
        System.out.println("num2D.length  " + num2D.length);
        System.out.println("num2D[0].length  " + num2D[0].length);
        for (int row = 0; row < num2D.length; row++) {
            for (int col = 0; col < num2D[row].length; col++) {
                System.out.print("(" + row + ", " + col + ") ==>> ");
                System.out.print(num2D[row][col] + ", ");
            }
            System.out.println();
        }
        // Creating a 2D array of String and going thtough with foreach
        String[][] names = { { "Java", "C" }, { "C++", "C#" }, { "ASP.NET", "JavaScript" } };
        // for(data-type of each index  pointer-name: name-of-collection){ body }
        for(String[] row: names) {
            for(String val: row) {
                System.out.print(val + ", ");
            
           
        
            }         
        
        }
	}
}
        
        
    
	
	
        
        
        
