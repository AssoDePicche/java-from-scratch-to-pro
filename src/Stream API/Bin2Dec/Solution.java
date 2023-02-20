import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Solution {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    UnaryOperator<String> reverse = x -> new StringBuilder(x).reverse().toString();

    Function<String, Integer> binaryToInteger = x -> Integer.valueOf(x, 2);

    numbers.stream().map(Integer::toBinaryString).map(reverse).map(binaryToInteger).forEach(System.out::println);
  }
}
