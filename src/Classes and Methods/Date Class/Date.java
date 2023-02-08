public class Date {
  private int day, month, year;

  public Date() {
    this(1, 1, 1970);
  }

  public Date(int month, int day, int year) {
    this.month = month;

    this.day = day;

    this.year = year;
  }

  public String getDate() {
    return String.format("%d-%d-%d", month, day, year);
  }
}
