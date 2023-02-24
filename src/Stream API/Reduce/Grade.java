public class Grade {
  private double total;

  private int quantity;

  public Grade add(double... grades) {
    for (double grade : grades) {
      total += grade;

      quantity++;
    }

    return this;
  }

  public Grade add(Grade... grades) {
    for (Grade grade : grades) {
      total += grade.total;

      quantity += grade.quantity;
    }

    return this;
  }

  public double average() {
    return total / quantity;
  }

  public String toString() {
    return String.valueOf(average());
  }
}
