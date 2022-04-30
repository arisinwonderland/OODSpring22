public class Builder {
  public static Builder m_instance;
  public static Builder getInstance() {
    if (m_instance == null)
      m_instance = new Builder();
    return m_instance;
  }
  private Builder() {}
}