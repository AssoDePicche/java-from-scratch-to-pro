import java.util.ArrayList;

public class Course {
  private String name;

  private final ArrayList<Student> students = new ArrayList<>();

  public String getName() {
    return name;
  }

  public Course(String name) {
    this.name = name;
  }

  public void search(String name) {
    for (Student student : students) {
      if (student.getName().equalsIgnoreCase(name)) {
        System.out.println(student + " is enrolled in");

        return;
      }
    }

    System.out.println(name + " is not enrolled in");
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void enroll(Student student) {
    students.add(student);

    student.getCourses().add(this);
  }

  public String toString() {
    return name;
  }
}
