import java.util.*;

public class Order {
   // state...
   private Customer m_cust; 
   private ArrayList<Item> m_items;
  
   // behavior...
   public Order(Customer cust) {
     m_cust = cust;
     m_items = new ArrayList<Item>();
   }

   public void addItem(Item i) {
     m_items.add(i);
   }
  
   public String toString() {
     String s = "Order for " + m_cust;
     s += "\nOrder Items:";

     for (Item i : m_items) {
       s += ("\n" + i);
     }
     
     return s;
   }

}
