import java.util.*;

public class Decision implements IDecision {
  private String m_question;
  private IDecision m_yes;
  private IDecision m_no;
  private String m_yesTerminal;
  private String m_noTerminal;

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

  /**
   * Asks the user the question that was specified when the Decision object
   * was created.  The return value specifies how we should proceed.  If a
   * Decision object is returned then it should be the next question asked.  If
   * null is returned then a conclusion has been printed to the screen, and the
   * line of questioning should stop.
   */
  public IDecision ask() {
    Scanner scan = new Scanner(System.in);
    System.out.println(m_question);
    if (scan.next().equals("yes")) {
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