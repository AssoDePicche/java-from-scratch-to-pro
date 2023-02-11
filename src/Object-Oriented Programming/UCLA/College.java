public class College {
  public static void main(String[] args) {
    Course c1, c2, c3;

    Student student = new Student("Russel Westbrook");

    c1 = new Course("Economics & Business");

    c2 = new Course("Humanities & Cultures");

    c3 = new Course("Biology & Health");

    student.enroll(c1);

    student.enroll(c2);

    student.enroll(c3);

    if (student.getCourses().isEmpty()) {
      System.out.println(student + " is not enrolled in any course");

      return;
    }

    System.out.println(student + " enrolled in:");

    for (Course course : student.getCourses()) {
      System.out.println(course);
    }
  }
}
