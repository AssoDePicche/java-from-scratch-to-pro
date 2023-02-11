public class AzureRoller implements KartComponent {
  private double speed = -0.5;

  private double acceleration = 1;

  private double weight = -0.5;

  private double handling = 0.25;

  private double traction = -0.25;

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
