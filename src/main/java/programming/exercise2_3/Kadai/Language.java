package programming.exercise2_3.Kadai;

public interface Language {

  public default String speakChinese(String message) {
    return message;
  }

  public default String speakKorean(String message) {
    return message;
  }
}
