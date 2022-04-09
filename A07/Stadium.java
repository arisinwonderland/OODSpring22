import java.util.*;

public class Stadium
{
    private String m_name;
    private String m_city;
    private int m_capacity;
    private boolean m_kidzone;
    
    public Stadium(String name, String city, int capacity, boolean kidzone)
    {
        m_name = name;
        m_city = city;
        m_capacity = capacity;
        m_kidzone = kidzone;
    }
    
    public String getName()
    { return m_name; }
    
    public String getCity()
    { return m_city; }
    
    public int getCapacity()
    { return m_capacity; }
    
    public boolean getKidzone()
    { return m_kidzone; }
    
    @Override
    public String toString()
    { 
        String kz = getKidzone() ? "has a" : "does not have a";
        return String.format("%s, located in %s, %s kidzone.", getName(), getCity(), kz); 
    
    }
    
    static class ByKidZoneCityName implements Comparator<Stadium>
    {
      public static ByKidZoneCityName m_instance;
      public static ByKidZoneCityName getInstance() {
        if (m_instance == null)
          m_instance = new ByKidZoneCityName();
        return m_instance;
      }     

      @Override
      public int compare(Stadium s1, Stadium s2) {
        if (s1.getKidzone() != s2.getKidzone())
          return s1.getKidzone() ? 1 : -1;
        if (!s1.getCity().equals(s2.getCity())) 
          return s1.getCity().compareTo(s2.getCity());
        return s1.getName().compareTo(s2.getName());
      }
    }
}