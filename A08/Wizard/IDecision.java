
public interface IDecision
{
    /**
     * Specifies the IDecision that should follow this one if the user answers yes
     * to the question.
     */
    public void setYes(IDecision yes);
    
    /**
     * Specifies the IDecision that should follow this one if the user answers no
     * to the question.
     */
    public void setNo(IDecision no);
    
    /**
     * Specifies the conclusion that will be printed if the user answers yes
     * to the question.
     */
    public void setYesTerminal(String terminal);

    /**
     * Specifies the conclusion that will be printed if the user answers no
     * to the question.
     */
    public void setNoTerminal(String terminal);

    /**
     * Asks the user the question that was specified when the Decision object
     * was created.  The return value specifies how we should proceed.  If a
     * Decision object is returned then it should be the next question asked.  If
     * null is returned then a conclusion has been printed to the screen, and the
     * line of questioning should stop.
     */
    public IDecision ask();

}
