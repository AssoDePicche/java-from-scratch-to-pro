public class Product {
  private String name;

  private double price, discount;

  public Product(String name, double price, double discount) {
    this.name = name;

    this.price = price;

    this.discount = discount;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getDiscount() {
    return discount;
  }
}
