package kouza.exercise2_3.Kadai;

public class Kadai2_3 {

  public static void main(String[] args) {

    English eg = new English();
    eg.speakEnglish("American");

    Japanese jp = new Japanese();
    jp.speakJapanese("日本人");

    Language lg1 = new English();
    lg1.speakChinese("中国人");

    Language lg2 = new Japanese();
    lg2.speakKorean("韓国人！");
  }
}
