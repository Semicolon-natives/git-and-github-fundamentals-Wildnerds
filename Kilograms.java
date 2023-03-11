import java.util.Scanner;

public class Kilograms {
	public static void main(String[] args) {
	
			// Create new Scanner object.
		Scanner input = new Scanner(System.in);	

		// Prompt user to input the amount of water in kilos.
		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();
		// Prompt user to enter the  temperature.
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		// Prompt the user to enter the final temperature.
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		// Sum of the energy
		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

		// Display outcome
		System.out.println("The energy needed is " + energy);
	}
}
