public class SolidConstructionHouse extends House {
  public SolidConstructionHouse(int sqrFt) {
    super(sqrFt);
  }
  public SolidConstructionHouse() {
    super();
  }
  
  @Override
  public double estimate() {
    return super.estimate() * 1.25;
  }
}