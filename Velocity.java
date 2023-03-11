import java.util.Scanner;

public class Velocity{
	public static void main(String[] args) {
	
	//Create new Scanner Object
		Scanner input = new Scanner(System.in);

		//Assign Variables Value
		
		System.out.println("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		// Calculate the average acceleration
		double a = (v1 - v0) / t;

		// Display result
		System.out.println("The average acceleration is " + a);
	}
}
