package kouza.exercise2_1;

import java.util.List;
import java.util.stream.Collectors;

public class Main2_1 {
  //StreamAPIとラムダ式

  public static void main(String[] args) {
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numberList.stream()
        .mapToInt(number -> number)
        .filter(number -> number <= 5)
        .forEach(System.out::println);

    numberList.stream()
        .limit(3)
        .forEach(System.out::println);

    List<String> studentList = List.of("yamada", "inoue", "tanaka", "yamada");
    studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .forEach(System.out::println);

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .collect(Collectors.joining(",")));

    String result = studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .collect(Collectors.joining(","));
    System.out.println(result);

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .toList());

    List<String> List = studentList.stream()
        .map(String::toUpperCase)
        .sorted()
        .distinct()
        .toList();
    System.out.println(List);

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .filter(v -> v.startsWith("Y"))
        .findFirst());

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .allMatch(v -> v.startsWith("Y")));
  }
}
