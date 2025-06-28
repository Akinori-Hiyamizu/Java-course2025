package kouza.exercise3_3;

public class Book {

  String title;
  String author;
  int number;

  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumber() {
    return number;
  }

  public String toString() {
    return "タイトル: " + title + ", 著者: " + author + ", 番号: " + number;
  }

}
