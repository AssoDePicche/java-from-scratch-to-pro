import java.util.ArrayList;

public class Pokemon {
  private final String name;

  private final Type type;

  private int attack;

  public final ArrayList<Type> weaknesses = new ArrayList<>();

  public Pokemon(String name, Type type, int attack) {
    this.name = name;

    this.type = type;

    this.attack = attack;
  }

  public int damage(Pokemon pokemon) {
    System.out.println(name + " has attacked!");

    boolean superEffective = pokemon.weaknesses.contains(type);

    System.out.println(superEffective ? "It was super effective!\n" : "It wasnt effective...\n");

    return superEffective ? (attack * 2) : attack;
  }

  public double attacksToWinAgainst(Pokemon pokemon) {
    return Math.round(100 / damage(pokemon));
  }

  public String getName() {
    return name;
  }

  public ArrayList<Type> getWeaknesses() {
    return weaknesses;
  }
}
