import java.util.Arrays;

public class DropBoth implements IFilter {
  public int[] filter(int[] ary) {
    if (ary.length < 2) 
      return new int[0];
    int[] drop = new int[ary.length-2];
    Arrays.sort(ary);
    for (int i = 0; i < drop.length; i++) 
      drop[i] = ary[i+1];
    return drop;
  }
}