public class Kart {
  private String driver;

  private double speed = 0, acceleration;

  public Kart(String driver, double acceleration) {
    this.driver = driver;

    this.acceleration = acceleration;
  }

  public void move() {
    speed = (speed != 0) ? speed * acceleration : acceleration;
  }

  public void stop() {
    speed = (speed - (speed / acceleration) > 0) ? speed - (speed / acceleration) : 0;
  }

  public double getTravelTime(double miles) {
    return miles / speed;
  }

  public String getDriver() {
    return driver;
  }
}
