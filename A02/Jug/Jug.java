public class Jug {
  private String liquidType;
  private int gallons;

  // constructors
  
  public Jug() {
    liquidType = "water";
    gallons = 0;
  }
  public Jug(String type, int gal) {
    liquidType = type;
    gallons = gal;
  }

  // setters/getters
  
  public void setGallons(int gal) {
    gallons = gal;
  }
  public int getGallons() {
    return gallons;
  }
  public String getLiquidType() {
    return liquidType;
  }

  // other methods

  public boolean isEmpty() {
    return gallons == 0;
  }
}