import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

    Predicate<Integer> even = x -> x % 2 == 0;

    Predicate<Integer> odd = x -> x % 2 != 0;

    System.out.println(list.stream().allMatch(even));

    System.out.println(list.stream().noneMatch(odd));

    System.out.println(list.stream().anyMatch(odd));
  }
}
