public class Gradebook {
  LinearProbingHM<Student, Double> grades;
  
  public Gradebook() {
    grades = new LinearProbingHM<Student, Double>();
  }
  
  public void updateGrade(Student s, double grade) {
    grades.put(s, grade);
  }
  
  public double grade(Student s) {
    return grades.get(s);
  }
}
