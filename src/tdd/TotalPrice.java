package tdd;

public class TotalPrice{
    int price = 2_000;
    private int numberOfCopies;
    int TotalPrice = 2_000 * numberOfCopies;


    public TotalPrice(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}

