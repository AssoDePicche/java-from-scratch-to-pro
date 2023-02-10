import java.util.Scanner;

public class Solution {
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    double sum = 0.0;

    System.out.println("Type the number of grades:");

    int numberOfGrades = getNextInt();

    double[] grades = new double[numberOfGrades];

    for (int i = 0; i < grades.length; i++) {
      System.out.println("Type the " + getOrdinal(i + 1) + " grade:");

      double grade = getNextDouble();

      grades[i] = grade;

      sum += grade;
    }

    SCANNER.close();

    System.out.println("The average of grades is " + (sum / grades.length) + ".");
  }

  private static int getNextInt() {
    return Integer.valueOf(SCANNER.nextLine());
  }

  private static double getNextDouble() {
    return Double.valueOf(SCANNER.nextLine().replace(",", "."));
  }

  private static String getOrdinal(int number) {
    String ordinal = String.valueOf(number);

    switch (number) {
      case 1:
        ordinal += "st";
        break;

      case 2:
        ordinal += "nd";
        break;

      case 3:
        ordinal += "rd";
        break;

      default:
        ordinal += "th";
    }

    return ordinal;
  }
}
