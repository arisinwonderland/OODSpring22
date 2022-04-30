import java.util.*;

public class Decision implements IDecision {
  private static Scanner m_scan;
  private String m_question;
  private IDecision m_yes;
  private IDecision m_no;
  private String m_yesTerminal;
  private String m_noTerminal;

  public Decision (String question) {
    if (m_scan == null)
      m_scan = new Scanner(System.in);
    m_question = question;
  }

  public static void closeScanner() {
    if (m_scan != null)
      m_scan.close();
  }

  public void setYes(IDecision yes) {
    m_yes = yes;
  }
  public void setNo(IDecision no) {
    m_no = no;
  }
  
  public void setYesTerminal(String terminal) {
    m_yesTerminal = terminal;
  }
  public void setNoTerminal(String terminal) {
    m_noTerminal = terminal;
  }

  public IDecision ask() {
    System.out.println(m_question);
    String ans = m_scan.next();
    if (ans.equals("yes")) {
      if (m_yes != null)
        return m_yes;
      else {
        System.out.println(m_yesTerminal);
        return null;
      }
    } else {
      if (m_no != null)
        return m_no;
      else {
        System.out.println(m_noTerminal);
        return null;
      }
    }
  }
  
}