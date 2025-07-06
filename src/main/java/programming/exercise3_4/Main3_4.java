package programming.exercise3_4;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class Main3_4 {
  //デバッグの実践

  public static void main(String[] args) {
    List<Student> studentList = IntStream.range(0, 10)
        .mapToObj(i -> new Student(UUID.randomUUID().toString(), "山田" + i)).toList();
    StudentManager manager = new StudentManager(studentList);

    Student student = manager.search("山田3");
    System.out.println(student.getName());
  }


}
