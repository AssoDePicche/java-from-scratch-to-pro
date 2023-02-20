import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Bulbasaur", "Charmander", "Squirtle", "Caterpie", "Weedle", "Pidgey", "Rattata");

    Predicate<String> filterNamesByLetters = x -> x.contains("a");

    Predicate<String> filterNamesByPrefix = x -> x.startsWith("C");

    Predicate<String> filterNamesBySuffix = x -> x.endsWith("r");

    Function<String, String> toUppercase = x -> x.toUpperCase();

    Consumer<String> printNames = System.out::println;

    list.stream()
        .filter(filterNamesByLetters)
        .filter(filterNamesByPrefix)
        .filter(filterNamesBySuffix)
        .map(toUppercase)
        .forEach(printNames);
  }
}
