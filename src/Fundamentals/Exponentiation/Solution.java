import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Type a number:");

    double number = getNextLine();

    SCANNER.close();

    raise(number, 2);

    raise(number, 3);
  }

  private static double getNextLine() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }

  private static void raise(double base, double exponent) {
    System.out.println(base + " raised by " + exponent + " is " + Math.pow(base, exponent));
  }
}
