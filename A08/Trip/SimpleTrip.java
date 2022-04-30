public class SimpleTrip implements ITrip
{
    private String m_location;
    
    public SimpleTrip(String location)
    {
        m_location = location;
    }
    
    @Override
    public void travel()
    {
        System.out.printf("Visiting %s%n", m_location);
    }
}