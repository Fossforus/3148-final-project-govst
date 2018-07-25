import java.util.Scanner;
import java.text.DecimalFormat;
//Cheap Mart 
//Java 3148 Final Project

public class MainDriver {
	
	
	public static void main(String[] args) {
		//Generic greetings and then directs the user to the main menu/DIRectory
		System.out.println("Hello and welcome to Cheap Mart!");
		dir();
		
	}
	//method of menu/DIRectory 
	//directs all of the users decisions
	public static void dir() {
			Scanner scan = new Scanner(System.in);
			
			//stores the users choice for category
			int choice = 1;
			
			//error checking variable for switch input
			boolean correctChoice = false;
			
			//Displays all of the categories that can be explored
			System.out.println("Here are the categories avaliable: ");
			System.out.println("1.) Electronics");
			System.out.println("2.) Clothing");
			System.out.println("3.) Exercise");
			System.out.println("4.) Outdoor");
			System.out.println("5.) Kitchen \n");
			
			//Instructions for user on how to navigate program
			System.out.println("Enter the number of the corresponding category you would like to explore: ");
			System.out.println("(or enter 0 to exit)");
			
			choice = scan.nextInt();	
			
			//possible alternative to while loop already in place
			/*while (!(Integer.toString(choice).matches("[0-9]+"))) {
            System.out.printf("\"%s\" is not a valid number.\n");
            }*/
			
			//Looks to go infinite when user tries to exit after a purchase or chooses option 0
			//While loop for error handling
			while(correctChoice == false) {
				
				//Switch statement that will show the user products based on category
				switch (choice) {
				
				case 0: Goodbye();
					break;
					
				case 1: System.out.println("Electronics");
                    correctChoice = true;
					//Electronics();
					break;
					
				case 2: System.out.println("Clothing");
					//main example for how
					//this will work
                    correctChoice = true;
					Clothing();
					break;
					
				case 3: System.out.println("Exercise");
                    correctChoice = true;
					//Exercise();
					break;
					
				case 4: System.out.println("Outdoor");
                    correctChoice = true;
					//Outdoor();
					break;
					
				case 5: System.out.println("Kitchen");
                    correctChoice = true;
					//Kitchen();
					
					break;
                default: System.err.println("Invalid choice please try again");
                    correctChoice = false;
					dir();
					//added above function call to make sure that it loops back to start of function
				}
			}
	}
	//exit screen
	public static void Goodbye(){
		System.out.println("Thank you for shopping with us!\nGoodbye!");
		return;
	}
	//Display objects and thier names
	//Instantiates all of the Clothing-Product objects
	public static void Clothing() {
		
		//Instantiate each new product so it is available to be called
		Product p1 = new Product("Men's Lightweight Cotton Logo Pajama Pants",
			"A modern take on loungewear,these jogger pants from Polo Ralph Lauren combine comfortable cotton \n" +
			"jersey with a relaxed fit and an allover signature pony print.\n ", "Large", 24.99, 3," Ralph Lauren","Clothing");
		Product p2 = new Product("Men's Cool Ultra-Soft Light Weight Crew-Neck T-Shirt",
			"Keep cool and dry with our crew neck tee shirt, can be worn alone or as a layering piece" +
			" adding depth to your wardrobe.\n Reach for this crew-neck T-shirt from 32 Degrees for an easygoing off-duty look. \n", "Medium", 
			10.99, 3,"32 degrees","Clothing");
		Product p3 = new Product("Comfort Stretch Pajama Pants" , "Comfort is key at bedtime. Reach for these pants from " +
			"32 Degrees when you're ready to wind down. \n", "Small", 17.99, 3,"32 degrees","Clothing");
		Product p4 = new Product("Men's pajama shorts" , " A comfortable way to end the day, these pajama shorts from Bar III are" +
			"a stylish casual look. A drawstring waist lets you adjust the fit.\n", "Small/Medium/Large", 17.99, 3,
			"Bar III  ","Clothing");
		Product p5 = new Product("Men's Colorblocked Henley Pajama Shirt, Created for Macy's" , 
			"Colorblocking updates the classic Henley in this Bar III pajama top, a stylish go-to for your laid-back look.\n", "Small/Medium/Large",
			11.99, 3," Bar III  ","Clothing");
		
		//Calls OptionMenu and passes each newly instantiated object so that users can see more details
		OptionsMenu(p1, p2, p3, p4, p5);
		
		
	}
	
	
	//Function that will display a menu of items from the chosen department
	//Takes 5 product objects as constructors 
	public static void OptionsMenu(Product p1, Product p2, Product p3, Product p4, Product p5){
		Scanner scan = new Scanner(System.in);
		int choice;
		//Displays each product's name to the user
		System.out.println("Here are the names of the available products in this department: \n");
		System.out.println("1.)\t"+p1.getName()+"\n");
		System.out.println("2.)\t"+p2.getName()+"\n");
		System.out.println("3.)\t"+p3.getName()+"\n");
		System.out.println("4.)\t"+p4.getName()+"\n");
		System.out.println("5.)\t"+p5.getName()+"\n");
		//Instructs the user on how to view the details of a particular product
		System.out.println("Enter the number of the corresponding product you would like to see: ");
		System.out.println("(or enter 0 to go back to the main menu)");
		
		choice = scan.nextInt();
			
			//Switch statement that will show the user the details of a chosen product and purchase 
			switch (choice) {
				
				case 0: dir();
					break;
				case 1: 
					Purchase(p1);
					break;
				case 2: 
					Purchase(p2);
					break;
				case 3: 
					Purchase(p3);
					break;
				case 4: 
					Purchase(p4);
					break;
				case 5: 
					Purchase(p5);
					break;
								
			}
		
	}
	//Method for purchasing, converts p1 to a generic object name and then handles it individually
	public static void Purchase(Product p1) {
		p1 = p1;
		int quantity;
		Scanner scan = new Scanner(System.in);

		//Displays the finer details of the product
		System.out.println("Product Name : " + p1.getName() + "\n");
        System.out.println("Desciption : " + p1.getDescription() + "\n");
        System.out.println("Size : " + p1.getSize() + "\n");
        System.out.println("Price : $" + p1.getPrice() + "\n");
        System.out.println("Quantity : " + p1.getQuantity() + "\n");
        System.out.println("Seller : " + p1.getSellerName());
        System.out.println("Category : " + p1.getCategory());
        
        System.out.print("Enter your shipping address : ");
        
        String shippingAddress;
        
        shippingAddress = scan.nextLine();
        
        System.err.print("Enter the number of quantity you need : " );
        
        quantity = scan.nextInt();
        
        p1.setQuantity(quantity);
        
        
        Cart c1 = new Cart(p1.getName(),shippingAddress, p1.getQuantity(), p1.getPrice());
        
        System.out.println("\n\nName of product in cart : " + c1.getName());
        System.out.println("Shipping Address : " + c1.getShippingAdress());
        System.out.println("=============================================");
        System.out.println("Quantity : " + p1.getQuantity());
        System.out.println("Price : " + p1.getPrice());
        System.out.println("Shipping Cost : $3");
        System.out.println("Tax : 10%");
        System.err.println("---------------------------------------------");
        
        // Round the output to two decimal places
      DecimalFormat fmt = new DecimalFormat("0.##");
        System.err.println("Final amount due : $" + fmt.format(c1.finalPrice()));
        System.err.println("---------------------------------------------");
		//Calls continue method to ask the user if they would like to continue shopping after a purchase
		Continue();
	}
	
	//Method for asking the user if they would like to continue shopping after a purchase
	public static void Continue() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("Would you like to continue shopping?\n(Enter 1 to continue or enter 2 to exit)");
		
		choice = scan.nextInt();
		//basic error handling method for integers
		if(choice == 1) {
			
			dir();
		} else if(choice == 2) {
			
			Goodbye();
		} else {
			System.out.println("I didn't quite get that");
			Continue();
			}
		}		
}
