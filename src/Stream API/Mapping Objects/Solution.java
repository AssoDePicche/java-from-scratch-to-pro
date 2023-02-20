import java.util.Arrays;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 4, 6, 8);

    list.stream().map(Orderer.dual).forEach(System.out::println);
  }
}
