package programming.exercise3_3;

import java.util.ArrayList;
import java.util.List;

public class Librarycopy {

  private List<Bookcopy> bookListcopy;

  public Librarycopy() {

    Bookcopy bookcopy1 = new Bookcopy("実学", "稲盛和夫", 1);
    Bookcopy bookcopy2 = new Bookcopy("金儲けのレシピ", "事業家bot", 2);
    Bookcopy bookcopy3 = new Bookcopy("苦しかったときの話をしようか", "森岡毅", 3);

    bookListcopy = List.of(bookcopy1, bookcopy2, bookcopy3);

  }

  public List<Bookcopy> lookupTitle(String keyword) {
    List<Bookcopy> list = new ArrayList<>();
    for (Bookcopy bookcopy : bookListcopy) {
      if (bookcopy.getTitle().contains(keyword)) {
        list.add(bookcopy);
      }
    }
    return list;
  }

  public List<Bookcopy> lookupAuthor(String keyword) {
    List<Bookcopy> list = new ArrayList<>();
    for (Bookcopy bookcopy : bookListcopy) {
      if (bookcopy.getAuthor().contains(keyword)) {
        list.add(bookcopy);
      }
    }
    return list;
  }

  public Bookcopy lookupNumber(int number) {
    for (Bookcopy bookcopy : bookListcopy) {
      if (bookcopy.getNumber() == number) {
        return bookcopy;
      }
    }
    return null;
  }


}


