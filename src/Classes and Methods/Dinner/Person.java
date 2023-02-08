public class Person {
  private String name;

  private double weight;

  public Person(String name, double weight) {
    this.name = name;

    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public void eat(Food... foods) {
    for (Food food : foods) {
      if (food == null) {
        return;
      }

      weight += food.getWeight();

      System.out.println(name + " ate " + food.getName() + " and gained " + food.getWeight() + " kilograms");
    }

    System.out.println("Now, " + name + " has " + weight + " kilograms");
  }
}
