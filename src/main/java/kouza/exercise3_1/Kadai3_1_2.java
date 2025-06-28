package kouza.exercise3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kadai3_1_2 {
  //正規表現で英数字の大文字、漢字・ひらがな・カタカナの日本語、英数字以外を抜き出す。

  public static void main(String[] args) {
    List<String> mojiList = new ArrayList<>(Arrays.asList(
        "たけ3",
        "YUKI",
        "東京32",
        "アサヒ",
        "12345",
        "桜道",
        "KEN88",
        "サクラ1",
        "ふじ山",
        "山田5",
        "HANA7",
        "ひかり",
        "カナ22",
        "江戸川",
        "aiueo",
        "リンゴ9",
        "美月",
        "こけし",
        "TORA5",
        "京アキ",
        "はな78",
        "MIKA3",
        "白雪",
        "トモコ",
        "れいか",
        "NANA",
        "大和3",
        "まつり",
        "ユウキ",
        "9876"
    ));

    List<String> onlyoEisuOmoji = mojiList.stream()
        .filter(m -> m.matches("^[A-Z0-9]+$"))
        .collect(Collectors.toList());
    System.out.println(onlyoEisuOmoji);

    List<String> onlyKanaHiraKata = mojiList.stream()
        .filter(
            m -> m.matches("^[\\u4E00-\\u9FFF\\u3040-\\u309F\\u30A0-\\u30FFー]+$"))
        .collect(Collectors.toList());
    System.out.println(onlyKanaHiraKata);

    List<String> EisuIgai = mojiList.stream()
        .filter(m -> m.matches("[^A-Za-z0-9]+"))
        .collect(Collectors.toList());
    System.out.println(EisuIgai);

  }

}
