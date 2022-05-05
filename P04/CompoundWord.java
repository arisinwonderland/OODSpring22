import java.util.*;
  
public class CompoundWord implements IWord {
  private List<IWord> m_words;
  public CompoundWord(IWord w1, IWord w2) {
    m_words.add(w1);
    m_words.add(w2);
  }
  
  @Override
  public String getWord() {
    String word = "";
    for (IWord m_word : m_words) {
      word += m_word.getWord();
    }
    return word;    
  }
}