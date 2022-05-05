public class SimpleWord implements IWord
{
    private String m_word;
    
    public SimpleWord(String word)
    {
        m_word = word;
    }
    
    @Override
    public String getWord() {
        return m_word;
    }
}