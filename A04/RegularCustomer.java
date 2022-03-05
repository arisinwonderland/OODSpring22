public class RegularCustomer implements IElectricBill {
  public double calc(int kwh) {
    return m_rate * kwh;
  }
}