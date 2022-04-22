public class CountAlg implements IDiffAlg {
  public static int convertBase (char b) {
    switch(b) {
      case 'A': 
        return 0;
      case 'G':
        return 1;
      case 'C':
        return 2;
      case 'T':
        return 3;
      default:
        return -1;
      }
  }
  
  public int difference(String seq1, String seq2) {
    if (seq1.length() != seq2.length())
      return -1; // I know this isn't necessary, but it makes me feel better
    int[] counts1 = new int[4];
    int[] counts2 = new int[4];

    for (int i = 0; i < seq1.length(); i++) {
      counts1[convertBase(seq1.charAt(i))]++;
      counts2[convertBase(seq2.charAt(i))]++;
    }

    int diff = 0;
    for (int i = 0; i < 4; i++) 
      diff += Math.abs(counts1[i] - counts2[i]);

    return diff;
  }
}