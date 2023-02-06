import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Type a word:");

    String string = SCANNER.nextLine();

    SCANNER.close();

    for (int i = 0; i < string.length(); i++) {
      System.out.println(string.charAt(i));
    }
  }
}
