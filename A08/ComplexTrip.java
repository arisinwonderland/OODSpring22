import java.util.*;
  
public class ComplexTrip implements ITrip {
  private List<ITrip> m_trips;
  public ComplexTrip(String location) {
    m_trips.add(new SimpleTrip(location));
  }
  
  @Override
  public void travel() {
    for (ITrip t : m_trips) {
      t.travel();
    }
  }
  
  public ComplexTrip add(ITrip trip) {
    m_trips.add(trip);
    return this;
  }
}