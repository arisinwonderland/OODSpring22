import java.util.*;

public class Main
{
   public static void main(String args[])
   {
      List<IElectricBill> bills = new ArrayList<IElectricBill>();
      bills.add(new DiscountCustomer());
      bills.add(new RegularCustomer());
      bills.add(new PreferredCustomer());
      
      System.out.printf("The base electric rate is %s%n", IElectricBill.m_rate);
      
      int count = 1;
      for (IElectricBill bill : bills)
      {
         System.out.printf("The total bill %d is $%.2f%n", count, bill.calc(231));
      }            
   }
}