public class Word implements IWord
{
    private String m_word;
    
    public Word(String word)
    {
        m_word = word;
    }
    
    @Override
    public String getWord() {
        return m_word;
    }
}