import java.util.*;

public class Sentence {
  private List<IWord> m_words;
  public Sentence() {
    m_words = new ArrayList<IWord>();
  }

  public Sentence add(IWord word) {
    m_words.add(word);
    return this;
  }

  public String getSentence() {
    String sentence = "";
    for (IWord m_word : m_words) {
      sentence += m_word.getWord();
      sentence += " ";
    }
    char first = Character.toUpperCase(sentence.charAt(0));
    sentence = first + sentence.substring(1,sentence.length()-1) + ".";
    return sentence;   
  }
}