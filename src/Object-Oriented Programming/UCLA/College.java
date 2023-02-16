import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class College {
  public static void main(String[] args) {
    Student student = new Student("Russel Westbrook");

    List<Course> courses = Arrays.asList(
        new Course("Economics & Business"),
        new Course("Humanities & Cultures"),
        new Course("Biology & Health"));

    courses.forEach(x -> student.enroll(x));

    if (student.getCourses().isEmpty()) {
      System.out.println(student + " is not enrolled in any course");

      return;
    }

    Stream<Course> enrolledCourses = student.getCourses().stream();

    System.out.println(student + " enrolled in:");

    enrolledCourses.forEach(System.out::println);
  }
}
