package tdd;

import java.util.Scanner;

public class NewMasterForCopies {

    public static void main(String[] args) {
        AmountOfCopies amountOfCopies = new AmountOfCopies();
        int amount;
        Scanner input = new Scanner(System.in);

         System.out.println("How many copies do you want?");
        int copies = input.nextInt();
        amount = amountOfCopies.Calculate(copies);
        System.out.println(amount);




    }
}
