public class Dinner {
  public static void main(String[] args) {
    Food spaghetti = new Food("Spaghetti", 0.242);

    Food roastBeef = new Food("Roast Beef", 0.375);

    Person person = new Person("Samuel", 60);

    person.eat(spaghetti, roastBeef);
  }
}
