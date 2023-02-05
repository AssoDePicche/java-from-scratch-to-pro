import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    int count = 0;

    double number, greatest = 0;

    while (count++ < 10) {
      number = getNextLine();

      if (number > greatest) {
        greatest = number;
      }
    }

    SCANNER.close();

    System.out.println("The greatest typed number is " + greatest);
  }

  public static double getNextLine() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }
}
