import java.util.Scanner;

public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double base, height;

    System.out.println("Type the base of the triangle:");

    base = getNextLine();

    System.out.println("Type the height of the triangle:");

    height = getNextLine();

    scanner.close();

    System.out.println("The area of triangle is: " + (0.5 * base * height));
  }

  private static double getNextLine() {
    return Double.valueOf(scanner.nextLine());
  }
}
