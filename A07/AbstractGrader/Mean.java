public class Mean extends AbstractGrader {
  public Mean(int[] grades, IFilter filter) {
    super(grades, filter);
  }
  
  public double grade() {
    int sum = 0;
    for (int grade : m_grades) {
      sum += grade;
    }
    return sum/m_grades.length;
  }
}