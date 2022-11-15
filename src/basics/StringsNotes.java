package basics;

public class StringsNotes {

	public static void main(String[] args) {
	
		
		// using literal - Uses String static pool 
	     String city = "Alexandria";
	     
	     // using the constructor of the class String
	     String country = new String("United State of America");
	     
	     String zipCode = new String();
	     zipCode = "22304";
	     
//-------------------------------------------------------------------------------------------------------------------------------------
	     
	     
	     String firstName = "John";
	        String lastName = "Smith";
	        
	        // Returns the length of the String
	        
	        int nameLength = firstName.length();
	        
	        
	        // Appends two string.
	        String fullName = firstName.concat(lastName);
	        
	        // Gets a portion of the String defined by starting index all the way to the end
	        String fullnameSub = fullName.substring(5);
	        // Gets a portion of the String in a range
	        String fullnameSub2 = fullName.substring(5, 7);
	        
	        // charAt return character of given index
	        char oneCharacter = fullName.charAt(2);
	        
	        // Returns the index of given char
	        //int indexNumber = fullName.indexOf("J");
	//​
	        // Checks to see if the String contains the value given
	        boolean itIncludes = firstName.contains("Joh");
	        
	        // Checks to see if the String starts with the given String
	        boolean startingWith = firstName.startsWith(fullnameSub2);
	        
	        // Checks to see if the String ends with the given String
	        boolean endingWith = firstName.endsWith("n");
	        
	        // Checks to see the value of the two given Strings are equal
	        boolean hasSameValues = firstName.equals(lastName);
	        
	        // Checks to see if the value of the two given Strings are equal ignoring the cases
	        boolean hasSameValueIgnoreCase = firstName.equalsIgnoreCase(lastName);
	        
	//​
	        // Replaces the first instance on the first argument to the second argument
	        String newFistName = firstName.replace("o", "a");
	        
	        // Replaces all of the instances of the first argument to the second argument
	        String newName = firstName.replaceAll("a", "o");
	        
	        // Splits the given String to multiple based on the regex provided, returns an array of String
	        String[] nameSegments = firstName.split(" ");
	        
	        // Return an array of characters of all of the chars in the given String
	        char[] characters = firstName.toCharArray();
	        
	        // Returns String of the given String in lower case
	        String firstNameLower = firstName.toLowerCase();
	
	        
	        
	        String firstNameUpper1 = "sohrab"; 
	        //	​
	        // Returns String of the given String in upper case
	        String firstNameUpper11 = firstName.toUpperCase();
	        System.out.println(firstNameUpper11);
	        
	        // Converts the given value to String and returns that String
	        String boolValue = String.valueOf(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
