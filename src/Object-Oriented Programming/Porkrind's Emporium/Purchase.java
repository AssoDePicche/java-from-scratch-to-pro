import java.util.ArrayList;

public class Purchase {
  private Customer customer;

  private double total = 0;

  private final ArrayList<Item> items = new ArrayList<>();

  public void add(Item... item) {
    for (Item obj : item) {
      items.add(obj);

      total += obj.getTotal();
    }
  }

  public double getTotal() {
    return total;
  }
}
