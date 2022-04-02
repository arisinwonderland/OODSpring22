
public class Main
{
    public static void main(String[] args)
    {
        IEstimatable house1 = new House(4791);
        System.out.println(house1.estimate()); // should print 464727
    
        IEstimatable house2 = new SolidConstructionHouse(4791);
        System.out.println(house2.estimate()); // should print 580908.75              
    }
}
