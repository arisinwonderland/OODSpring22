import java.util.Arrays;

public class Median extends AbstractGrader {
  public Median(int[] grades, IFilter filter) {
    super(grades, filter);
  }
  
  public double grade() {
    if (m_grades.length == 0) 
      return 0.0;
    Arrays.sort(m_grades);
    int index = (int)(m_grades.length/2.0);
    if (m_grades.length % 2 == 1)
      return m_grades[index];
    return (m_grades[index-1]+m_grades[index])/2.0;
  }
}