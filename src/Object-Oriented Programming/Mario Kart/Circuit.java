public class Circuit {
  private String name;

  private double length;

  private int laps;

  public Circuit(String name, double length, int laps) {
    this.name = name;

    this.length = length;

    this.laps = laps;
  }

  public String getName() {
    return name;
  }

  public double getLength() {
    return length;
  }

  public int getLaps() {
    return laps;
  }
}
