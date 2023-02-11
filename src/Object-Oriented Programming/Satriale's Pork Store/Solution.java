public class Solution {
  public static void main(String[] args) {
    Customer customer = new Customer("Tony Soprano");

    Item item = new Item("Cannoli", 12, 3.50);

    Purchase purchase = new Purchase(customer);

    purchase.add(item);

    System.out.println(purchase.getTotal());
  }
}
