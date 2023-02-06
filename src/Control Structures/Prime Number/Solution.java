import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Type a number:");

    double number = getNextLine();

    System.out.println(isPrime(number) ? number + " is prime" : number + " is not prime");

    SCANNER.close();
  }

  private static double getNextLine() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }

  private static boolean isPrime(double number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
