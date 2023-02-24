public class Girlfriend implements ArrivesAtThePartyObserver {
  public void arrive(ArrivesAtTheParty event) {
    System.out.println("Turn off the lights...");

    System.out.println("Be quiet...");

    System.out.println("Surprise!");
  }
}
