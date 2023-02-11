public class Employee {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    return obj.hashCode() == hashCode();
  }

  @Override
  public int hashCode() {
    return name.length();
  }
}
