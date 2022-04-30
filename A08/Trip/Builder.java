public class Builder {
  public static Builder m_instance;
  public static Builder getInstance() {
    if (m_instance == null)
      m_instance = new Builder();
    return m_instance;
  }
  private Builder() {}
  public ITrip createTrip() {
    ComplexTrip MoCATrip = new ComplexTrip("MASSMoCA").add(new SimpleTrip("Lewitt Exhibit")).add(new SimpleTrip("Cafe"));
    ComplexTrip adamsTrip = new ComplexTrip("North Adams").add(MoCATrip).add(new SimpleTrip("MCLA"));
    ComplexTrip pittsfieldTrip = new ComplexTrip("Pittsfield").add(new SimpleTrip("Science Museum")).add(new SimpleTrip("Baseball Game"));
    ComplexTrip fullTrip = new ComplexTrip("Home").add(adamsTrip).add(pittsfieldTrip);
    return fullTrip;
  }
}