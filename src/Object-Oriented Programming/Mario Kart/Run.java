public class Run {
  private Kart p1, p2;

  private Circuit track;

  public Run(Kart p1, Kart p2, Circuit track) {
    this.p1 = p1;

    this.p2 = p2;

    this.track = track;
  }

  public static void main(String[] args) {
    new Run(
        new Kart("Mario", 1.25),
        new Kart("Luigi", 1.3),
        new Circuit("Rainbow Road", 3200, 3)).start();
  }

  public void start() {
    System.out.println("The race starts. " + p1.getDriver() + " and " + p2.getDriver() + " speed up!\n");

    for (int i = 0; i < track.getLaps(); i++) {
      p1.move();

      p2.move();
    }

    p1.stop();

    p2.stop();

    System.out.println(getLooser().getDriver() + " did not arrive in time...\n");

    System.out.println(getWinner().getDriver() + " won!");
  }

  public Kart getWinner() {
    double miles = track.getLength();

    return p1.getTravelTime(miles) < p2.getTravelTime(miles) ? p1 : p2;
  }

  public Kart getLooser() {
    double miles = track.getLength();

    return p1.getTravelTime(miles) > p2.getTravelTime(miles) ? p1 : p2;
  }
}
