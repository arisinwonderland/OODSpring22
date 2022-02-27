public class Item {
   // state
   private String m_desc;
   private int m_qty;
   private double m_price;
  
   // behavior
   public Item(String desc, double price, int qty) {
     m_desc = desc;
     m_qty = qty;
     m_price = price;
   }
  
   public String toString() {
     return m_desc + ": " + m_qty + " at " + m_price;
   }

}
