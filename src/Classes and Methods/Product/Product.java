public class Product {
  public static double defaultDiscount = 0.25;

  private String name;

  private double price;

  public Product(String name, double price) {
    this.name = name;

    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double discountPrice() {
    return price * (1 - defaultDiscount);
  }

  public double discountPrice(double discount) {
    return price * (1 - discount);
  }
}
