public class Validator implements IAnalyzer {
  public int analyze (String s) {
    if (s.equals(""))
      return -1;
    String s_new = s.replace("+","");
    s_new = s_new.replace("-","");
    if (s_new.equals("")) 
      return 1;
    return -1;
  }
}