public class Triplet {
  private double beginner;
  private double intermediate;
  private double expert;

  public void setBeginner(double b) {
    beginner = b;
  }
  public void setIntermediate(double i) {
    intermediate = i;
  }
  public void setExpert(double e) {
    expert = e;
  }

  public String toString() {
    return String.format("Beg: %.2f Int: %.2f Exp: %.2f", beginner, intermediate, expert);
  }
}