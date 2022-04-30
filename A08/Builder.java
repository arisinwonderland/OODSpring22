public class Builder {
  public static Builder m_instance;
  public static Builder getInstance() {
    if (m_instance == null)
      m_instance = new Builder();
    return m_instance;
  }
  private Builder() {}
  public ITrip createTrip() {
    ITrip trip = new ComplexTrip("North Adams");
    ITrip temp = new ComplexTrip("MASSMoCA").add(new SimpleTrip("Lewitt Exhibit")).add(new SimpleTrip("Cafe"));
    trip.add(temp).add(new SimpleTrip("MCLA"));
  }
}