import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
       int total = 0;
    Scanner input = new Scanner (System.in);

       System.out.println("input First number");
       int firstNumber = input.nextInt();
       System.out.println("input second Number");
       int secondNumber = input.nextInt();
       total = secondNumber;
       if (secondNumber >= firstNumber) {

           System.out.printf("%d is greater or equal to %d", secondNumber, firstNumber);

       }else {
           while (total < firstNumber) {
               System.out.println("enter another number");
              int number = input.nextInt();
              total += number;
           }
           System.out.printf( "the sum of the numbers entered is %d", total);
       }


    }

}
