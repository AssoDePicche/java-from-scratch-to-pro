import java.util.HashMap;
import java.util.Map.Entry;

public class Office {
  private String name;

  private HashMap<Integer, Employee> employees = new HashMap<>();

  public Office(String name) {
    this.name = name;
  }

  public void hire(Employee employee) {
    employees.put(employee.hashCode(), employee);
  }

  public void fire(Employee employee) {
    employees.remove(employee.hashCode());
  }

  public void listEmployees() {
    for (Entry<Integer, Employee> employee : employees.entrySet()) {
      System.out.println("ID: " + employee.getKey() + " => " + employee.getValue().getName());
    }
  }
}
