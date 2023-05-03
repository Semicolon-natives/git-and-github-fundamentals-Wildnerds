package tdd;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountOfCopiesTest {

    @Test

    public void TestAmountOfCopies(){
        AmountOfCopies amountOfCopies = new AmountOfCopies();
    }
    void CalculatePrice(){
        AmountOfCopies amountOfCopies = new AmountOfCopies();
        //amountOfCopies.Calculate(3);
        assertEquals(6000, AmountOfCopies.Calculate(3));

    }
}
