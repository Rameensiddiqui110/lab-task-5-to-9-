
import java.util.*;

class lab_task_8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First & Second Number: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Which Arithmetic Operation Would You Like To Perform?");
		System.out.println("Press: \n1) for Division\n2) for Multiplication\n3) for Addition\n4) for Subtraction");
		int operation = sc.nextInt();
		double calc = 0;
		
		switch(operation){
			case 1:
				calc = num1/num2;
				System.out.println("Dividing " + num1 + " by " + num2 + " answer is: " + calc);
				break;
			case 2:
				calc = num1*num2;
				System.out.println("Multiplying " + num1 + " by " + num2 + " answer is: " + calc);
				break;
			case 3:
				calc = num1+num2;	
				System.out.println("Adding " + num1 + " and " + num2 + " answer is: " + calc);
				break;
			case 4:
				calc = num1-num2;
				System.out.println("Subtracting " + num1 + " from " + num2 + " answer is: " + calc);	
				break;
			default:
				System.out.println("Wrong Numnber Entered!");


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
