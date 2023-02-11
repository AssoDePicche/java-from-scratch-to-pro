public class CloudGlider implements KartComponent {
  private double speed = 0;

  private double acceleration = 0.25;

  private double weight = -0.25;

  private double handling = 0;

  private double traction = 0;

  public double getSpeed() {
    return speed;
  }

  public double getAcceleration() {
    return acceleration;
  }

  public double getWeight() {
    return weight;
  }

  public double getHandling() {
    return handling;
  }

  public double getTraction() {
    return traction;
  }
}
