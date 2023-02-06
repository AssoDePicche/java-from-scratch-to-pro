import java.util.Random;
import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    int attempts = 10, guess = 0, number = 0;

    number = new Random().nextInt(0, 100);

    System.out.println("Try to guess a number between 0 and 100");

    do {
      try {
        guess = getNextLine();

        if (guess < number) {
          System.out.println("\nTry a bigger number, buddy...");
        } else if (guess > number) {
          System.out.println("\nTry a smaller number, buddy...");
        }

      } catch (Exception exception) {
        System.out.println("\nType only numbers, buddy...");
      }

      attempts--;

      if (guess != number) {
        System.out.println("You have " + attempts + " attempts left");
      }

      if (attempts == 0) {
        System.out.println("\nYour attemps ended, buddy... The secret number is " + number);

        return;
      }
    } while (guess != number);

    System.out.println("\nAll right, fella, you found out the secret number");
  }

  private static int getNextLine() {
    return Integer.valueOf(SCANNER.nextLine().replace(",", "."));
  }
}
