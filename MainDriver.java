import java.util.Scanner;
public class MainDriver {
	
	
	public static void main(String[] args) {
		
		dir();
		
	}
	
	public static void dir() {
		Scanner scan = new Scanner(System.in);
	//stores the users choice for category
			int choice = 1;
			
			
			System.out.println("Here are the categories avaliable: ");
			System.out.println("#1) Electronics");
			System.out.println("#2) Clothing");
			System.out.println("#3) Exercise");
			System.out.println("#4) Outdoor");
			System.out.println("#5) Kitchen \n");
			
			System.out.println("Enter the number of the corresponding category you would like to explore: ");
			System.out.println("(or enter 0 to exit)");
			
			
			choice = scan.nextInt();	
			//Switch statement that will show the user products based on category
			
			switch (choice) {
				
				case 0: Goodbye();
				
					break;
				case 1: System.out.println("Electronics");
				
					break;
				case 2: System.out.println("Clothing");
					Clothing(); //main example for how
								//this will work
					break;
				case 3: System.out.println("Exercise");
				
					break;
				case 4: System.out.println("Outdoor");
				
					break;
				case 5: System.out.println("Kitchen");
					break;
				
			}
	}
		//exit screen
	public static void Goodbye(){
		System.out.println("Thank you for shopping with us!\nGoodbye!");
}
		//Display objects and thier names
		public static void Clothing() {
			Product Clothing1 = new Product("Gillette Fusion Manual Razor","Gillette Fusion razor blades feature advanced 5-blade technology\n" +
"Gillette Fusion razor blades are spaced closer together than Mach3 to help reduce pressure for a close\n" +
"Gillette Fusion's Flexible Comfort Guard features microfins that follow the contours of your face\n" +
"Gillette Fusion razor blades feature a precision beard trimmer for those tricky spots like sideburns\n" +
"Gillette Fusion razor blades have a Indicator Lubrication Strip that fades to white.", "Men's Razor and 5 Blades", 8.97, 1,"Gillete","Beauty and personal Care");
       
			System.out.println(Clothing1.getName());
	
}
}