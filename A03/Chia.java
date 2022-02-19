public class Chia {
  private String mood;

  public Chia() {
    mood = "Happy";
  }

  public String getMood () {
    return mood;
  }

  public void talkToChia() {
    mood = "Happy";
  }

  public void yellAtChia() {
    mood = "Sad";
  }

  public void singToChia() {
    mood = "Terrified";
  }
}