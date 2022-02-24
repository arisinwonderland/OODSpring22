public class Wheel {
   // state...
   private int m_pressure;
   
   // behavior...
   public Wheel(int pressure) {
    m_pressure = pressure;
   }
   
   public void setPressure(int pressure) {
     m_pressure = pressure;
     if (m_pressure < 0)
       m_pressure = 0;
   }
   
   public int getPressure() {
     return m_pressure;
   }
   
   public String toString() {
     return "Pressure = " + m_pressure;
   }

}
