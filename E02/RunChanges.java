public class RunChanges extends Validator {
  @Override
  public int analyze (String s) {
    if (super.analyze(s) == -1)
      return -1;
    
    int count = 1;
    char last = s.charAt(0);

    for (char c : s.toCharArray()) {
     if (c != last) 
       count++;
      last = c;
    }
    
    return count;
  }
}