import java.util.Scanner;

public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Type a number:");

    double number = getNextLine();

    scanner.close();

    raise(number, 2);

    raise(number, 3);
  }

  private static double getNextLine() {
    return Double.valueOf(scanner.nextLine());
  }

  private static void raise(double base, double exponent) {
    System.out.println(base + " raised by " + exponent + " is " + Math.pow(base, exponent));
  }
}
