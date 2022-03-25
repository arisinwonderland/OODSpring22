public class DominantRunChar extends Validator {
  @Override
  public int analyze (String s) {
    if (super.analyze(s) == -1)
      return -1;
    
    int longestRun = 0;
    int currentRun = 0;
    char longestChar = s.charAt(0);
    char currentChar = s.charAt(0);

    for (char c : s.toCharArray()) {
     if (c == currentChar) {
       currentRun++;
     } else {
       currentChar = c;
       currentRun = 1;
     }
      if (currentRun >= longestRun) {
        longestRun = currentRun;
        longestChar = currentChar;
      }
    }

    if (longestChar == '+')
      return 1;
    else
      return -1;
  }
}