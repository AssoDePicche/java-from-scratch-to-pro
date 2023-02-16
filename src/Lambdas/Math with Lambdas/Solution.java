import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    BinaryOperator<Double> sum, sub, div, mul;

    sum = (x, y) -> x + y;

    sub = (x, y) -> x - y;

    div = (x, y) -> x / y;

    mul = (x, y) -> x * y;

    double x, y, result;

    System.out.print("Type a number: ");

    x = getNextDouble();

    System.out.print("Type another number: ");

    y = getNextDouble();

    printMenu();

    String operation = SCANNER.nextLine();

    SCANNER.close();

    switch (operation) {
      case "1":
        result = sum.apply(x, y);
        break;

      case "2":
        result = sub.apply(x, y);
        break;

      case "3":
        if (y == 0) {
          System.out.println("Invalid operation");

          return;
        }

        result = div.apply(x, y);
        break;

      case "4":
        result = mul.apply(x, y);
        break;

      default:
        System.out.println("Invalid option");

        return;
    }

    System.out.println("The result is " + result);
  }

  public static double getNextDouble() {
    return Double.valueOf(SCANNER.nextLine());
  }

  public static void printMenu() {
    System.out.println("[1] Sum");

    System.out.println("[2] Subtraction");

    System.out.println("[3] Division");

    System.out.println("[4] Product");

    System.out.print("Operation: ");
  }
}
