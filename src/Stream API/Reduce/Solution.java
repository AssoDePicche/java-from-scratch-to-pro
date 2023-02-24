import java.util.Arrays;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<Grade> grades = Arrays.asList(
        new Grade().add(9.25, 8.75, 10, 9.8),
        new Grade().add(9.95, 8.6, 8.9, 10),
        new Grade().add(10, 8.5, 8.75, 10));

    grades.stream()
        .filter(x -> x.average() > 5)
        .reduce((x, y) -> x)
        .ifPresent(System.out::println);
  }
}
