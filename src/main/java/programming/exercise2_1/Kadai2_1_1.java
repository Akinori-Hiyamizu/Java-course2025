package programming.exercise2_1;

import java.util.List;
import java.util.stream.Collectors;

public class Kadai2_1_1 {
  //文字列のリストを作成　要素数１０個
  //その文字列に対して文字数が２以上のもとを抽出して、文字列に変換　区切り文字は，
  //その文字列を出力

  public static void main(String[] args) {
    List<String> words =
        List.of("今", "今日は", "と", "とても", "暑", "暑い",
            "汗", "汗が", "た", "たくさん", "出", "出る");
    System.out.println(words.stream()
        .filter(v -> v.length() >= 2)
        .collect(Collectors.joining(",")));

    //または
    String result = words.stream()
        .filter(v -> v.length() >= 2)
        .collect(Collectors.joining(","));
    System.out.println(result);
  }
}
