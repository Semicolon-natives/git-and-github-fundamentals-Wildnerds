package LearningWithJava;

public class MethodsLearning {

    public static void main(String[] args) {
        boolean storeOpen = true;
        int firstDaySales = 1000;
        int secondDaySales = 1700;
        int thirdDaySales = 200;

        calculateStorePrice(true, 1000, 1700, 200);

        calculateStorePrice(true, 4000, 3400, 700);


    }





    public static void calculateStorePrice(boolean storeOpen, int firstDaySales, int secondDaySales, int thirdDaySales) {
        if (storeOpen) {
            int storePriceAddUp = firstDaySales + secondDaySales + thirdDaySales;
            storePriceAddUp += 5000;
            System.out.println("The total price is " + storePriceAddUp);
        }



        }
    }


