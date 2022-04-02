import java.util.Arrays;

class Top2Grader extends Grader
{
  private int m_curve;
  
  public Top2Grader(Integer ary[]) {
    super(ary);
  }
  
  @Override
  public double calculateGrade() {
    Integer ary[] = getGrades();
    if (ary.length == 0)
      return 0.0;
    else if (ary.length == 1)
      return ary[0];

    Arrays.sort(ary);
    double g1 = ary[ary.length-1];
    double g2 = ary[ary.length-2];

    return (g1 + g2)/2.0;
  }
  
  @Override
  public String toString() { 
    return "Top2Grader"; 
  }
}