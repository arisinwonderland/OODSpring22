public class Customer {
   // state...
   private String m_first;
   private String m_last;
   
   // behavior...
   public Customer(String first, String last) {
     m_first = first;
     m_last = last;
   }
   
   public String toString() {
     return m_last + ", " + m_first; 
   }
}
