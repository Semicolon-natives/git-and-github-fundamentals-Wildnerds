import java.util.Scanner;

 public class DrivingCost{

        public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter dirving distance");
        
        int firstNumber = userInput.nextInt();
        
        System.out.println("Enter miles per gallon");
        
        int secondNumber = userInput.nextInt();
        
        System.out.println("Enter price per gallon");
        
        int thirdNumber = userInput.nextInt();
        
        int sum = firstNumber + secondNumber + thirdNumber;
        
        System.out .println("The sum of" + firstNumber + "and" + secondNumber + "and" + thirdNumber + "is" + sum);
        }
}

