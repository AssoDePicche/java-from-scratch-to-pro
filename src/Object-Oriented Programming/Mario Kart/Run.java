public class Run {
  public static void main(String[] args) {
    KartComponent wheel, glider;

    Kart kart;

    wheel = new AzureRoller();

    glider = new CloudGlider();

    kart = new Biddybuggy(wheel, glider);
  }
}
