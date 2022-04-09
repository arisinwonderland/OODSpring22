public abstract class AbstractGrader implements IGrader {
  protected IFilter m_filter;
  protected int[] m_grades;

  public AbstractGrader(int[] grades, IFilter filter) {
    m_grades = grades;
    m_filter = filter;
  }
  
  public abstract double grade();
}