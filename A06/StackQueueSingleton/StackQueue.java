import java.util.*;

public class StackQueue {
  public static StackQueue m_instance;
  
  public static StackQueue getInstance() {
    if (m_instance == null)
      m_instance = new StackQueue();
    return m_instance;
  }
  private StackQueue() {};

  public void pushOnStack(String s, List<String> l) {
    l.add(0,s);
  }
  public String popFromStack(List<String> l) {
    return l.remove(0);
  }
  public void addToQueue(String s, List<String> l) {
    l.add(s);
  }
  public String removeFromQueue(List<String> l) {
    return l.remove(0);
  }
  
}