public class Car
{
   // state...
   private Wheel m_frontLeft;
   private Wheel m_frontRight;
   private Wheel m_backLeft;
   private Wheel m_backRight;
  
   // behavior...
   public Car() {
     m_frontLeft = new Wheel(30);
     m_frontRight = new Wheel(30);
     m_backLeft = new Wheel(30);
     m_backRight = new Wheel(30);
   }   
   
   public void drive() {
     m_frontLeft.setPressure(m_frontLeft.getPressure() - 5);
     m_frontRight.setPressure(m_frontRight.getPressure() - 5);
     m_backLeft.setPressure(m_backLeft.getPressure() - 5);
     m_backRight.setPressure(m_backRight.getPressure() - 5);
   }

   public void fillTires() {
     m_frontLeft.setPressure(30);
     m_frontLeft.setPressure(30);
     m_frontRight.setPressure(30);
     m_backLeft.setPressure(30);
   }
   
   public String toString() {
     return String.format("Car (FR: Pressure = %s, FL: Pressure = %s, BR: Pressure = %s, BL: Pressure = %s)",m_frontRight,m_frontLeft,m_backRight,m_backLeft);

   }
}
