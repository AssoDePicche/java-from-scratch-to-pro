import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    double base, height;

    System.out.println("Type the base of the triangle:");

    base = getNextLine();

    System.out.println("Type the height of the triangle:");

    height = getNextLine();

    SCANNER.close();

    System.out.println("The area of triangle is: " + (0.5 * base * height));
  }

  private static double getNextLine() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }
}
