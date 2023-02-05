import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    double a, b, c, delta, x1, x2;

    System.out.println("Type value of a:");

    a = getNextLine();

    System.out.println("Type value of b:");

    b = getNextLine();

    System.out.println("Type value of c:");

    c = getNextLine();

    SCANNER.close();

    delta = getDelta(a, b, c);

    x1 = (-b + Math.sqrt(delta)) / (2 * a);

    x2 = (-b - Math.sqrt(delta)) / (2 * a);

    System.out.printf("The delta of %.2f² + %.2fx + %.2f is %.2f\n", a, b, c, delta);

    System.out.println("x1 is " + x1);

    System.out.println("x1 is " + x2);
  }

  private static double getDelta(double a, double b, double c) {
    return Double.valueOf(Math.pow(b, 2) - (4 * a * c));
  }

  private static double getNextLine() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }
}
