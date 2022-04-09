public class Mean extends AbstractGrader {
  public Mean(int[] grades, IFilter filter) {
    super(grades, filter);
  }
  
  public double grade() {
    if (m_grades.length == 0) 
      return 0.0;
    int[] grades;
    if (m_filter == null) 
      grades = m_grades;
    else
      grades = m_filter.filter(m_grades);
    int sum = 0;
    for (int grade : grades) {
      sum += grade;
    }
    return (double)sum/grades.length;
  }
}