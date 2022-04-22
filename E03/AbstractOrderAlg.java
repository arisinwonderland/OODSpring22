public abstract class AbstractOrderAlg implements IDiffAlg
{
    @Override
    public int difference(String seq1, String seq2)
    {
        int diff = 0;
        for (int i = 0; i < seq1.length(); i++)
        {
            char ch1 = seq1.charAt(i);
            char ch2 = seq2.charAt(i);
            if (ch1 != ch2)
                diff = diff + getPenalty(ch1);
        }
        return diff;
    }

    abstract protected int getPenalty(char ch1);
}
