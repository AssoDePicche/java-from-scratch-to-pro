import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {
    Consumer<String> println = System.out::println;

    Stream<String> langs = Stream.of("Java", "Lua", "JavaScript", "Python", "PHP", "C++");

    langs.forEach(println);

    String[] moreLangs = { "Perl", "Go", "Lisp" };

    Arrays.stream(moreLangs).forEach(println);

    List<String> moreMoreLangs = Arrays.asList("C#", "Kotlin");

    moreMoreLangs.parallelStream().forEach(println);
  }
}
