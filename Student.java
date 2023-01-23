public class Student {
  private String first_name;
  private String last_name;
  private int grade_level;
  private String[] class_schedule;
  
  public Student(String fn, String ln, int gl, String[] cs) {
    this.first_name = fn;
    this.last_name = ln;
    this.grade_level = gl;
    this.class_schedule = cs; //<-Fix this line.
  }
  
  @Override
  public int hashCode() {
  }  
}
