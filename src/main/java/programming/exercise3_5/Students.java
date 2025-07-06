package programming.exercise3_5;

public class Students {

  public String name;
  public int score;

  public Students(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String toString() {
    return name + "：" + score + "点";
  }
}
