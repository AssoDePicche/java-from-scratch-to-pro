import java.util.ArrayList;

public class Student {
  private String name;

  private final ArrayList<Course> courses = new ArrayList<>();

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void search(String name) {
    for (Course course : courses) {
      if (course.getName().equalsIgnoreCase(name)) {
        System.out.println(course + " is registered");

        return;
      }
    }

    System.out.println(name + " not found");
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void enroll(Course course) {
    courses.add(course);

    course.getStudents().add(this);
  }

  public String toString() {
    return name;
  }
}
