import java.util.Arrays;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Bulbasaur", "Charmander", "Squirtle", "Caterpie", "Weedle", "Pidgey", "Rattata");

    list.stream()
        .filter(StringFilter.byContent("e"))
        .filter(StringFilter.byPrefix("P"))
        .filter(StringFilter.bySuffix("y"))
        .map(StringFilter.toUpperCase())
        .forEach(System.out::println);
  }
}
