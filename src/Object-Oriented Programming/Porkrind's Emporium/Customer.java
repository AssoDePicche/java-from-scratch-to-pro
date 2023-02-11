import java.util.ArrayList;

public class Customer {
  private String name;

  private double expenses = 0;

  private final ArrayList<Purchase> purchases = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void purchase(Purchase... purchase) {
    for (Purchase obj : purchase) {
      purchases.add(obj);

      expenses += obj.getTotal();
    }
  }

  public double getExpenses() {
    return expenses;
  }

  public String toString() {
    return name;
  }
}
