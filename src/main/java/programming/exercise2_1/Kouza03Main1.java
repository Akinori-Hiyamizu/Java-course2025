package programming.exercise2_1;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Kouza03Main1 {

  //01_Javaプログラミング演習②_07_StreamAPIとラムダ式
  public static void main(String[] args) {

    System.out.println("処理01-------------------------");
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numberList.stream()
        //.mapToInt(number -> number)
        .filter(number -> number <= 5)//フィルター
        .forEach(System.out::println);//繰り返し処理
    //明らかに使うものが決まっている場合は::を使う(::はメソッド参照)
    //System.out::println　⇒　(System.out.println(number)の略

    System.out.println("処理02-------------------------");
    numberList.stream()
        .limit(3)//制限
        .forEach(System.out::println);
    System.out.println();
    int sum = numberList.stream()
        .mapToInt(number -> number).sum();
    System.out.println(sum);

    System.out.println("処理03-------------------------");
    List<String> studentList = List.of("yamamoto", "satoh", "yamamoto", "tanaka", "suzuki");
    studentList.stream()
        .map(String::toUpperCase)//中間処理（途中で変換処理を加える）
        .forEach(System.out::println);//終端処理

    System.out.println("処理04-------------------------");
    studentList.stream()
        .sorted()//ソート
        .forEach(System.out::println);

    System.out.println("処理05-------------------------");
    String str = studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()//重複排除
        .collect(Collectors.joining(","));
    System.out.println(str);

    System.out.println("処理06-------------------------");
    List list2 = studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()//重複排除
        .toList();
    System.out.println(list2);

    System.out.println("処理07-------------------------");
    long lng1 = studentList.stream()
        .map(String::toUpperCase)
        //.sorted()
        .distinct()
        .count();
    //他に.sum()
    System.out.println(lng1);

    System.out.println("処理08-------------------------");
    String str2 = String.valueOf(studentList.stream()
        .map(String::toUpperCase)//大文字に変換
        .filter(v -> v.startsWith("Y"))//Yでスタートする要素だけ通す
        .sorted()//ソート
        .distinct()//重複排除
        //.anyMatch(v -> v.startsWith("E")));//Eでスタートする要素
        .findFirst());//最初の要素
    System.out.println(str2);

    System.out.println("処理09-------------------------");
    //今日紹介したものは一通り実装してください。
    //文字列のリストを作ってください。要素数は10個。
    //その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。
    //区切り文字はカンマ(,)で行ってください。
    List<String> list3 = List.of("正", "正負", "負", "正", "正負", "負", "負", "正", "正負", "正");
    String str3 = list3.stream()
        .filter(v -> v.length() >= 2)
        .collect(Collectors.joining(","));
    System.out.println(str3);

    System.out.println("処理10-------------------------");
    //数値のリストを作ってください。要素数は10個。
    //その数値の中の奇数のものだけを抽出して、平均値を出してください。
    //その平均値を出力してください。
    List<Integer> list4 = List.of(92, 56, 65, 76, 34, 63, 64, 67, 35, 39);
    OptionalDouble dbl4 = list4.stream()
        .filter(v -> v % 2 != 0)
        .mapToInt(v -> v)
        .average();
    System.out.println(dbl4);

    //ChatGPTなどの生成AIを使って、Stream APIの基礎的な課題を一つ作ってもらってください。
    //それを実際に実践してみてください。

    System.out.println("処理11-------------------------");
    //名前のリストから「名前の長さが4文字以上」で「"a" を含む」名前だけを抽出しなさい（大文字・小文字は区別しない）。
    //抽出した名前を アルファベット順（昇順） にソートしなさい。
    //結果を1行ずつ表示しなさい。
    List<String> list5 = List.of("koga", "matsumoto", "suzuki", "moghi", "itoh", "shiomi", "yamada",
        "nakamura", "murakami");
    list5.stream()
        .filter(v -> v.contains("a"))
        //.sorted(Comparator.reverseOrder())//降順
        .sorted(Comparator.naturalOrder())//昇順
        .forEach(System.out::println);
  }
}
