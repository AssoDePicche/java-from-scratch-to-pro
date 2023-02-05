public class BMICalculator {
  public static double calculate(double height, double weight) {
    return Double.valueOf(weight / Math.pow(height, 2));
  }
}
