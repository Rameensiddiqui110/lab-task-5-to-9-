
import java.util.*;

class lab_task_6{
	public static void main(String[] args){
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Our Restaurant! Press The Following Codes For Menu Item Prices: \n1) Chicken Borgir\n2) Beef Borgir\n3) Cheese Borgir\n4) Pizza\n5) Fries");
		a = sc.nextInt();
		
		switch(a){
			case 1:
				System.out.println("Chicken Borgir = Rs.100");
				break;
			case 2:
				System.out.println("Beef Borgir = Rs.200");
				break;
			case 3:
				System.out.println("Cheese Borgir = Rs.300");
				break;
			case 4:
				System.out.println("Pizza = Rs.400");
				break;
			case 5:
				System.out.println("Fries = Rs.50");
				break;
			default:
			System.out.println("Please Select Items From 1 to 5");												
		}
	}
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
