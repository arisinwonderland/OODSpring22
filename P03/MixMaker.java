public class MixMaker extends AbstractCombine {
  public String combine(String s1, String s2) {
    final int MIN_LENGTH = Math.min(s1.length(), s2.length());
    
    String combine = "";
    char[] c1 = this.ignoreCase(s1).toCharArray();
    char[] c2 = this.ignoreCase(s1).toCharArray();
    
    for (int i = 0; i < MIN_LENGTH; i++) {
      combine += c1[i];
      combine += c2[i];
    }

    if (s1.length() > s2.length()) 
      combine += s1.substring(MIN_LENGTH, s1.length());
    else if (s1.length() < s2.length()) 
      combine += s2.substring(MIN_LENGTH, s2.length());
    
    return combine;
  }
}