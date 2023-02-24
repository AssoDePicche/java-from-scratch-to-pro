public class Party {
  public static void main(String[] args) {
    Doorman doorman = new Doorman();

    Girlfriend girlfriend = new Girlfriend();

    doorman.addArrivesAtThePartyObserver(event -> System.out.println("Surprise!"), girlfriend);

    doorman.start();
  }
}
