package kouza.exercise2_3.Kadai;

public class Japanese implements Language {

  public String speakJapanese(String human) {
    System.out.println("こんにちは、私は" + human + "です!");
    return human;
  }

  @Override
  public String speakKorean(String message) {
    System.out.println("アニョハセヨ、チョヌン" + message + "イムニダ!");
    return message;
  }
}

