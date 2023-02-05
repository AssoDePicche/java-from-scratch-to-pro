import java.util.Scanner;

public class Solution {
  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double height, weight;

    System.out.println("Type your height in meters:");

    height = getNextLine();

    System.out.println("Type your weight in kilograms:");

    weight = getNextLine();

    scanner.close();

    System.out.println("Your BMI is: " + BMICalculator.calculate(height, weight));
  }

  public static double getNextLine() {
    return Double.valueOf(scanner.nextLine().replace(",", "."));
  }
}
