package kouza.exercise2_3.Kadai;

public class English implements Language {

  public String speakEnglish(String human) {
    System.out.println("Hello,I'm " + human + "!");
    return human;
  }


  @Override
  public String speakChinese(String message) {
    System.out.println("你好,我是 " + message + "!");
    return message;


  }
}
