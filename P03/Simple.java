public class Simple extends AbstractCombine {
  public String combine(String s1, String s2) {
    return this.ignoreCase(s1) + this.ignoreCase(s2);
  }
}