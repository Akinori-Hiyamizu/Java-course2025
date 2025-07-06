package programming.exercise3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kadai3_1_1 {
  //Listにランダムな文字列を３０個程度いれる。
  //作成したListに対して、「数字だけを抜き出す正規表現」と「文字だけ抜き出す正規表現」と試す。

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

    List<String> onlyNumbers = mojiList.stream()
        .filter(m -> m.matches("^\\d+$"))
        .collect(Collectors.toList());
    System.out.println(onlyNumbers);

    List<String> onlyMoji = mojiList.stream()
        .filter(m -> m.matches("^[^0-9]+$"))
        .collect(Collectors.toList());
    System.out.println(onlyMoji);

  }

}
