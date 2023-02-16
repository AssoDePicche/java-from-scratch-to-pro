import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Solution {
  public static void main(String[] args) {
    UnaryOperator<Double> cityTax, shipping, round;

    Function<Double, String> formmat;

    Function<Product, Double> discount = product -> {
      return product.getPrice() * (1 - product.getDiscount());
    };

    Product product = new Product("iPad", 3235.89, 0.13);

    cityTax = x -> x < 2500 ? x : x * 1.085;

    shipping = x -> x < 3000 ? x + 50.0 : x + 100.0;

    round = x -> Math.floor(x * 100) / 100;

    formmat = x -> "$" + String.valueOf(x).replace(".", ",");

    String price = discount.andThen(cityTax).andThen(shipping).andThen(round).andThen(formmat).apply(product);

    System.out.println(price);
  }
}
