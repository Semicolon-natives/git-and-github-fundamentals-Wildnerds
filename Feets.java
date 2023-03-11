import java.util.Scanner;

public class Feets{

	public static void main(String[] args) {
	
	// Create new scanner object
		Scanner input = new Scanner(System.in);
		

		
	// Create constant value
		final double METERS_PER_FOOT = 0.305;
		
		
	// Request user to enter a number in feet
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
	// Convert feet into meters
    		double meters = feet * METERS_PER_FOOT;
		
	 // Display results
   		 System.out.println(feet + " feet is " + meters + " meters");
		
		
		
		}
		
		


}		
		
