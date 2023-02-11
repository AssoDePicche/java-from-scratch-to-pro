public class Biddybuggy implements Kart {
  private double velocity = 0;

  private double speed = -0.75;

  private double acceleration = 1.25;

  private double weight = -0.5;

  private double handling = 0.5;

  private double traction = -0.25;

  public Biddybuggy(KartComponent wheel, KartComponent glider) {
    speed = avg(speed, wheel.getSpeed(), glider.getSpeed());

    acceleration = avg(acceleration, wheel.getAcceleration(), glider.getAcceleration());

    weight = avg(weight, wheel.getWeight(), glider.getWeight());

    handling = avg(handling, wheel.getHandling(), glider.getHandling());

    traction = avg(traction, wheel.getTraction(), glider.getTraction());
  }

  public double getVelocity() {
    return velocity;
  }

  public void accelerate(double velocity) {
    if (this.velocity == 0 && velocity < 0) {
      return;
    }

    this.velocity += speed + (velocity * acceleration) / (weight * handling * traction);
  }

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

  private double avg(Double... numbers) {
    double sum = 0;

    for (double number : numbers) {
      sum += number;
    }

    return sum / numbers.length;
  }
}
