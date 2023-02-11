public class Solution {
  public static void main(String[] args) {
    Office office = new Office("Dunder Mifflin");

    Employee employee, employee2, employee3;

    employee = new Employee("Jim Halpert");

    employee2 = new Employee("Pam Beesly");

    employee3 = new Employee("Dwight Schrute");

    office.hire(employee);

    office.hire(employee2);

    office.hire(employee3);

    office.listEmployees();
  }
}
