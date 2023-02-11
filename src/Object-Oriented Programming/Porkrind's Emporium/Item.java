public class Item {
  private Product product;

  private int quantity;

  public Item(Product product, int quantity) {
    this.product = product;

    this.quantity = quantity;
  }

  public double getTotal() {
    return product.getPrice() * quantity;
  }
}
