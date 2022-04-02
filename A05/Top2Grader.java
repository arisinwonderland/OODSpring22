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

    double g1 = ary[0];
    double g2 = ary[0];

    for (int i = 1; i < ary.length; i++) {
      if (ary[i] >= g2) {
        if (ary[i] >= g1) {
          g2 = g1;
          g1 = ary[i];
        } else {
          g2 = ary[1];
        }
      }
    }

    return (g1 + g2)/2.0;
  }
  
  @Override
  public String toString() { 
    return "Top2Grader"; 
  }
}