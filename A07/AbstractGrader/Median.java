import java.util.Arrays;

public class Median extends AbstractGrader {
  public Median(int[] grades, IFilter filter) {
    super(grades, filter);
  }
  
  public double grade() {
    if (m_grades.length == 0) 
      return 0.0;
    int[] grades;
    if (m_filter == null) {
      grades = m_grades;
      Arrays.sort(grades);
    } else
      grades = m_filter.filter(m_grades);
    int index = (int)(grades.length/2.0);
    if (grades.length % 2 == 1)
      return grades[index];
    return (double)(grades[index-1]+grades[index])/2.0;
  }
}