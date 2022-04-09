import java.util.Arrays;

public class DropLow implements IFilter {
  public int[] filter(int[] ary) {
    if (ary.length == 0) 
      return ary;
    int[] drop = new int[ary.length-1];
    Arrays.sort(ary);
    for (int i = 0; i < drop.length; i++) 
      drop[i] = ary[i+1];
    return drop;
  }
}