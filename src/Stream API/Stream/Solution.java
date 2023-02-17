import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {
    List<String> players = Arrays.asList("Mario", "Luigi", "Toad", "Peach", "Bowser");

    Stream<String> stream = players.stream();

    stream.forEach(System.out::println);
  }
}
