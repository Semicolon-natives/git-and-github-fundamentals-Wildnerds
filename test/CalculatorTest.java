import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public Calculator calculator = new Calculator();
    @Test
    public void testThatCalculatorExists(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
    }

    @Test
    public void testSubtracts(){
        Calculator calculator = new Calculator();
        int result = calculator.subract(2,3);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(2,3);
    }
}
