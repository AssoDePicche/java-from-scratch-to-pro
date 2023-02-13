public class Charmander extends Pokemon {
  public Charmander() {
    super("Charmander", Type.FIRE, 4);

    weaknesses.add(Type.WATER);
  }
}
