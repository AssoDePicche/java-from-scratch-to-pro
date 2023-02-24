public class Party {
  public static void main(String[] args) {
    Girlfriend girlfriend = new Girlfriend();

    Doorman doorman = new Doorman();

    doorman.addArrivesAtThePartyObserver(girlfriend);

    doorman.start();
  }
}
