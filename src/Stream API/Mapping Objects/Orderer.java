import java.util.function.UnaryOperator;

public class Orderer {
  public static final UnaryOperator<Integer> dual = x -> x * 2, half = x -> x / 2;
}
