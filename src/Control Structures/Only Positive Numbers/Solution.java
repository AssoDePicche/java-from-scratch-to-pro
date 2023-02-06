import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    double number;

    do {
      System.out.println("Type a positive number to continue or a negative number to exit:");

      number = Double.valueOf(SCANNER.nextLine().replace(",", "."));
    } while (number > 0);

    SCANNER.close();
  }
}
