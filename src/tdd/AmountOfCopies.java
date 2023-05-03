package tdd;

public class AmountOfCopies {

    static int amount;

    public static int Calculate(int copies) {
        if (copies > 0 && copies < 5) {
            amount = 2000 * copies;
        } else if (copies >=5 && copies<100) {

            switch (copies / 10) {
                case 0:
                    amount = 1800 * copies;
                    break;
                case 1, 2:
                    amount = 1600 * copies;
                    break;
                case 3, 4:
                    amount = 1500 * copies;
                    break;
                case 5, 6, 7, 8, 9:
                    amount = 1300 * copies;
                    break;
            }
        }else{
            switch (copies / 100){
                case 1:
                    amount = 1200 * copies;
                    break;
                case 2, 3, 4:
                    amount = 1100 * copies;
                    break;
                    default:
                        amount = 1000 * copies;
                        break;


            }

        }
        return amount;
    }
}