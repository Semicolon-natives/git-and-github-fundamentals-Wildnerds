import java.util.Scanner;

public class AreaTriangle {
    
    public static void main(String[] args) {
    	
    	// Initialiaze a native instace of the Java Scanner class
        Scanner input = new Scanner(System.in);
        
        
        //declare datatypes of variables
      
        System.out.print("Enter points of a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
        
        // Run calculations
        area = (x1 + y1* x2 + y2);
        
        // Display the area of the triangle
        System.out.println("area");
        

        
    }
}
