import java.util.*;

public class Main
{
    public static void main (String[] args) 
    {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        m.go(s.nextInt());
    }
    
    private void go(int height)
    {
        Triplet t = calcLengths(height, SkiConstants.getInstance());
        System.out.printf("Ski lengths-> %s", t);
    }
    
    private Triplet calcLengths(double height, SkiConstants constants)
    {
        Triplet t = new Triplet();
        t.setBeginner(constants.getBeginnerFactor() * height);
        t.setIntermediate(constants.getIntermediateFactor() * height);
        t.setExpert(constants.getExpertFactor() * height);
        return t;
    }
}