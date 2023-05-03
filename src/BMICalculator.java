public class BMICalculator {
    public static double calculate(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive and non-zero.");
        }

        return weight / (height * height);
    }
}
