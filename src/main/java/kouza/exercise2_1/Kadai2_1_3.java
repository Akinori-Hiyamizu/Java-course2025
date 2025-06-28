package kouza.exercise2_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kadai2_1_3 {
  //生成ＡＩを使って「Stream APIの基礎的な課題を作成してください」と入力
  //作成された課題を実践

  public static void main(String[] args) {
// Stream APIを使って、偶数だけを取り出して表示してください
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

// Stream APIを使って、すべて大文字に変換して出力してください
    List<String> names = Arrays.asList("taro", "jiro", "hanako");
    names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

// Stream APIを使って、3文字以上の単語だけをリストに集めて出力してください
    List<String> words = Arrays.asList("a", "ab", "abc", "abcd");
    List result = words.stream()
        .filter(w -> w.length() >= 3)
        .collect(Collectors.toList());
    System.out.println(result);

// Stream APIを使って、2倍にした数を昇順に並べて出力してください
    List<Integer> nums = Arrays.asList(5, 1, 3, 2);
    nums.stream()
        .map(n -> n * 2)
        .sorted()
        .forEach(System.out::println);

// Stream APIを使って、合計値を計算して出力してください
    List<Integer> scores = Arrays.asList(80, 90, 100, 70);
    int sum = scores.stream()
        .reduce(0, Integer::sum);
    System.out.println(sum);
  }
}
