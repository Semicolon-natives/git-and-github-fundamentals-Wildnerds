import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
public class Bmi {

        @Test
        public void testCalculateBMI() {
            // Test case 1: normal BMI
            double weight1 = 70.0;
            double height1 = 1.75;
            double expected1 = 22.86;
            double actual1 = BMICalculator.calculate(weight1, height1);
            assertEquals(expected1, actual1, 0.01);


            // Test case 2: underweight BMI

            double weight2 = 50.0;
            double height2 = 1.75;
            double expected2 = 16.33;
            double actual2 = BMICalculator.calculate(weight2, height2);
            assertEquals(expected2, actual2, 0.01);

            // Test case 3: overweight BMI
            double weight3 = 90.0;
            double height3 = 1.75;
            double expected3 = 29.39;
            double actual3 = BMICalculator.calculate(weight3, height3);
            assertEquals(expected3, actual3, 0.01);

            // Test case 4: zero height
            double weight4 = 70.0;
            double height4 = 0.0;
            assertThrows(IllegalArgumentException.class, () -> {
                BMICalculator.calculate(weight4, height4);
            });

            // Test case 5: negative height
            double weight5 = 70.0;
            double height5 = -1.75;
            assertThrows(IllegalArgumentException.class, () -> {
                BMICalculator.calculate(weight5, height5);
            });
        }
    }


