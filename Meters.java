import java.util.Scanner;

	public class Meters{
	
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create constant value
		final double METERS_PER_FOOT = 0.305;

		// Prompt user to enter a feet value in number
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		// Convert feet into meters
		double meters = feet * METERS_PER_FOOT;

		// Display results
		System.out.println(feet + " feet is " + meters + " meters");
	}
}
