public class PreferredCustomer implements IElectricBill {
  public double calc(int kwh) {
    return m_rate * kwh * 0.5;
  }
}