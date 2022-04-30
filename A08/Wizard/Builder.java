public class Builder {
  public static Builder m_instance;
  public static Builder getInstance() {
    if (m_instance == null)
      m_instance = new Builder();
    return m_instance;
  }
  private Builder() {}

  public IDecision buildWizard() {
    Decision jumpDecision = new Decision("Do you like to jump?");
    jumpDecision.setNoTerminal("Buy the ZR200 Model.");
    jumpDecision.setYesTerminal("Buy the ZR300 Model.");

    Decision skiExpertDecision = new Decision("Are you an expert?");
    skiExpertDecision.setNoTerminal("Buy the ZR200 Model.");
    skiExpertDecision.setYes(jumpDecision);

    Decision skiingDecision = new Decision("Have you gone skiing before?");
    skiingDecision.setNoTerminal("Buy the ZR100 Model.");
    skiingDecision.setYes(skiExpertDecision);

    Decision skiDecision = new Decision("Do you want to buy downhill skis?");
    skiDecision.setNoTerminal("Try skiing someday!");
    skiDecision.setYes(skiingDecision);
    
    Decision fastDecision = new Decision("Do you like to go fast?");
    fastDecision.setNoTerminal("Buy the XG200 Model.");
    fastDecision.setYesTerminal("Buy the XG300 Model.");

    Decision sbExpertDecision = new Decision("Are you an expert?");
    sbExpertDecision.setNoTerminal("Buy the XG200 Model.");
    sbExpertDecision.setYes(fastDecision);

    Decision snowboardingDecision = new Decision("Have you snowboarded before?");
    snowboardingDecision.setNoTerminal("Buy the XG100 Model.");
    snowboardingDecision.setYes(sbExpertDecision);
    
    Decision snowboardDecision = new Decision("Do you want to buy a snowboard?");
    snowboardDecision.setNo(skiDecision);
    snowboardDecision.setYes(snowboardingDecision);

    return snowboardDecision;
  }
}