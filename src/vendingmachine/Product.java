package vendingmachine;

public class Product {

	String name;
	double price;
	int qty;

	// constructors
	public Product() {
		name = "";
		price = 0;
		qty = 0;
	}

	public Product(String newName, double newPrice, int newQTY) {
		name = newName;
		price = newPrice;
		qty = newQTY;
	}

	public void printProductInfo() {
		System.out.println("Product [Name: " + name + ", Price: $" + price + ", Quantity: " + qty + "pcs]");
	}

	public boolean dispense() {
		// decrease the quantity
		// print a receipt
		// check to see if the qty > 1, if so, dispense
		if (qty > 0) {
			qty--;
			System.out.print("Item Sold => New Product info => ");
			printProductInfo();
			return true;
		} else {
			System.out.println("Out of Stock!");
			return false;
		}

	}
	
	public int reStock(int newQty) {
		qty += newQty;
		return qty;
	}

	public static void main(String[] args) {
		Product obj = new Product();
		obj.name = "Lays";
		obj.price = 5.55;
		obj.qty = 10;
		obj.printProductInfo();

		Product obj2 = new Product("M&M", 3.99, 2);
		obj2.printProductInfo();
		// store that boolean somewhere 
		// use that 
		boolean x = obj2.dispense();
		System.out.println(x);
		obj2.dispense();
		obj2.dispense();
		obj2.reStock(5);
		obj2.printProductInfo();
		obj2.dispense();

	}
}
