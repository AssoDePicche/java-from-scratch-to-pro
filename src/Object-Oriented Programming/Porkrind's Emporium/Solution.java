public class Solution {
  public static void main(String[] args) {
    Product p1, p2, p3;

    Item item1, item2, item3;

    p1 = new Product("Coffee", 3);

    p2 = new Product("P. Sugar", 3);

    p3 = new Product("Whetstone", 3);

    item1 = new Item(p1, 3);

    item2 = new Item(p2, 2);

    item3 = new Item(p3, 1);

    Purchase purchase = new Purchase();

    purchase.add(item1, item2, item3);

    Customer customer = new Customer("Cuphead");

    customer.purchase(purchase);

    System.out.println(customer + " spent " + customer.getExpenses() + " coins in Porkrind's Emporium.");
  }
}
