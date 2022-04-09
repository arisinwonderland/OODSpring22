import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.go();
    }
    
    private void go()
    {
        List<Stadium> parks = new ArrayList<Stadium>();
        
        parks.add(new Stadium("PNC Park", "Pittsburgh", 38362, true));
        parks.add(new Stadium("Dodgers Stadium", "Los Angeles", 56000, true));
        parks.add(new Stadium("Citizens Bank Park", "Philadelphia", 43035, false));
        parks.add(new Stadium("Coors Field", "Denver", 50398, true));
        parks.add(new Stadium("Yankee Stadium", "New York", 54251, false));
        parks.add(new Stadium("AT&T Park", "San Francisco", 41915, true));
        parks.add(new Stadium("Citi Field", "New York", 41922, false));
        parks.add(new Stadium("Angels Stadium", "Los Angeles", 45050, true));
        
        Collections.sort(parks, Stadium.ByKidZoneCityName.getInstance());
        for (Stadium s : parks)
            System.out.println(s);
    }
}