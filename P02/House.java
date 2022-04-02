public class House implements IEstimatable {
  private int m_sqrFt;

  public House() {
    House(0);
  }
  public House(int sqrFt) {
    m_sqrFt = sqrFt;
  }
  public double estimate() {
    if (m_sqrFt < 1000)
      return 97.0 * 1000;
    return 97.0 * sqrFt;
  }
}