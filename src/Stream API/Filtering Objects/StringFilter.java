import java.util.function.Function;
import java.util.function.Predicate;

public class StringFilter {
  public static final Predicate<String> byContent(String content) {
    return x -> x.contains(content);
  }

  public static final Predicate<String> byPrefix(String prefix) {
    return x -> x.startsWith(prefix);
  }

  public static final Predicate<String> bySuffix(String suffix) {
    return x -> x.endsWith(suffix);
  }

  public static final Function<String, String> toUpperCase() {
    return x -> x.toUpperCase();
  }
}
