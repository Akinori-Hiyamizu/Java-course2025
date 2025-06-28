package kouza.exercise3_5;

import java.util.ArrayList;
import java.util.List;

public class StudentsManager {

  private List<Students> students = new ArrayList<>();

  public void addStudent(String name, int score) {
    students.add(new Students(name, score));
  }

  public boolean removeStudent(String name) {
    return students.removeIf(s -> s.getName().equals(name));
  }

  public boolean updateScore(String name, int newscore) {
    for (Students s : students) {
      if (s.getName().equals(name)) {
        s.setScore(newscore);
        return true;
      }
    }
    return false;
  }

  public double calcurateAverage() {
    if (students.isEmpty()) {
      return 0;
    }
    int total = 0;
    for (Students s : students) {
      total += s.getScore();
    }
    return (double) total / students.size();
  }

  public void showAllStudents() {
    if (students.isEmpty()) {
      System.out.println("学生が登録されておりません。");
    } else {
      for (Students s : students) {
        System.out.println(s);
      }
    }
  }
}
