public class Age {
  public final int value;

  public Age(int age) {
    if (age < 0) {
      throw new InvalidAgeException();
    }

    this.value = age;
  }

  public String toString() {
    return String.valueOf(value);
  }
}
