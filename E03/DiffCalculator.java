import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiffCalculator
{
   public static void main(String[] args) throws IOException
   {
     DiffCalculator main = new DiffCalculator();
     main.go();
   }
   
   public DiffCalculator()
   {
   }
   
   public void go() throws IOException
   {   
      String s1 = "";
      String s2 = "";      
      
      s1 = "ACT";
      s2 = "ACT";      
      printDiff(s1, s2, OrderAlg.getInstance());
      printDiff(s1, s2, WeightedOrderAlg.getInstance());
      printDiff(s1, s2, CountAlg.getInstance());
      
      s1 = "GCG";
      s2 = "ACT";      
      printDiff(s1, s2, OrderAlg.getInstance());
      printDiff(s1, s2, WeightedOrderAlg.getInstance());
      printDiff(s1, s2, CountAlg.getInstance());    
   }
   
   private void printDiff(String s1, String s2, IDiffAlg alg)
   {
      int diff = alg.difference(s1, s2);
      System.out.printf("%s %s-%s = %s%n", alg.getClass().getName(), s1, s2, diff);
      
   }
}
