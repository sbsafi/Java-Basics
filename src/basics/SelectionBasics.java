package basics;

public class SelectionBasics {

	public static void main(String[] args) {
		
		double grade = 80;
		
		if (grade <=59) {
            System.out.println("F " + grade);
        } else if (grade <=69) {
            System.out.println("D " + grade);
        } else if (grade <=79) {
            System.out.println("C " + grade);
        } else if (grade <=89) {
            System.out.println("B " + grade);
        } else {
            System.out.println("A " + grade );
        }
		
		
		
		
		// create a double name = discount
        // create a String name = fullName
        // create an int name = age
        // create a char name = gender / 'f' for female and 'm' for male
        // create a double name = total
        // create a double name = discountAmount
        // assign some random values to these variables


        // total * percent / 100   gives you the discount percent

        // we are going to calculate the discount based on the age of the customer
        // if the customer is a female between 22-35 then we give 10% discount
        // if the customer is a male between 22-35 then we give 5% discount
        // if the customer is a female above 60, then 25% discount
        // if the customer is a male above 60, then 20% discount
        // if the customer is a female between 50-55, then 10% discount
        // if the customer is a male between 50-55, then 8% discount
        // anything else, no discount

        // calculate the discount based on the values of the variables
        // print the total before discount
        // print the discount amount
        // print the total after 
		
		
		
		double discount;
        String fullName;
        int age;
        char gender;
        double total;

        age = 53;
        gender = 'm';
        total = 250;



        if (gender == 'f' &&  age >=25 && age <=35 ) {
            discount = 10;
            System.out.println("Total before discount is "+ total);
            System.out.println("Discount is " + discount + "% or " + total * discount/100);
            System.out.println("Total after discount is " + (total - total*discount/100));
            } else if (gender == 'm' &&  age >=25 && age <=35 ) {
                discount = 5;
                System.out.println("Total before discount is "+ total);
                System.out.println("Discount is " + discount + "% or " + total * discount/100);
                System.out.println("Total after discount is " + (total - total*discount/100));
                } else if (gender == 'f' &&  age >60) {
                    discount = 25;
                    System.out.println("Total before discount is "+ total);
                    System.out.println("Discount is " + discount + "% or " + total * discount/100);
                    System.out.println("Total after discount is " + (total - total*discount/100));
                    } else if (gender == 'm' &&  age >60) {
                        discount = 20;
                        System.out.println("Total before discount is "+ total);
                        System.out.println("Discount is " + discount + "% or " + total * discount/100);
                        System.out.println("Total after discount is " + (total - total*discount/100));
                        } else if (gender == 'f' &&  age >=50 && age <=55 ) {
                            discount = 10;
                            System.out.println("Total before discount is "+ total);
                            System.out.println("Discount is " + discount + "% or " + total * discount/100);
                            System.out.println("Total after discount is " + (total - total*discount/100));
                            } else if (gender == 'm' &&  age >=50 && age <=55 ) {
                                discount = 8;
                                System.out.println("Total before discount is "+ total);
                                System.out.println("Discount is " + discount + "% or " + total * discount/100);
                                System.out.println("Total after discount is " + (total - total*discount/100));
                                } else {
                                    System.out.println("Sorry but you don't have any discount, your total amount is " + total);
                                }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
