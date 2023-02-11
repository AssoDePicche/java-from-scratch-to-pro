import java.util.ArrayList;

public class Purchase {
  private ArrayList<Item> items;

  private Customer customer;

  public Purchase(Customer customer) {
    items = new ArrayList<>();

    this.customer = customer;
  }

  public void add(Item item) {
    items.add(item);
  }

  public double getTotal() {
    double total = 0;

    for (Item item : items) {
      total += item.getPrice() * item.getQuantity();
    }

    return total;
  }
}
