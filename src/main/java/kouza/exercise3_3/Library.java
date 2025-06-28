package kouza.exercise3_3;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> bookList;

  public Library() {
    Book book1 = new Book("生き方", "稲盛和夫", 1);
    Book book2 = new Book("運動脳", "アンデシュ・ハンセン", 2);
    Book book3 = new Book("伝え方が９割り", "佐々木圭一", 3);
    bookList = List.of(book1, book2, book3);
  }

  public List<Book> searchForTitle(String keyword) {
    List<Book> list = new ArrayList<>();//検索でヒットした本の一覧を一時的に入れておく入れ物（リスト）を作成
    for (Book book : bookList) {
      if (book.getTitle().contains(keyword)) {
        list.add(book);//検索でヒットした本を上記の一時的なlistに追加
      }
    }
    if (list.isEmpty()) {
      System.out.println("該当するタイトルの本はありません。");
    } else {
      for (Book book : list) {
        System.out.println(book);
      }
    }
    return list;
  }

  public List<Book> searchForAuthor(String keyword) {
    List<Book> list = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getAuthor().contains(keyword)) {
        list.add(book);
      }
    }
    if (list.isEmpty()) {
      System.out.println("該当する著者の本はありません。");
    } else {
      for (Book book : list) {
        System.out.println(book);
      }
    }
    return list;
  }

  public Book searchForNumber(int number) {
    //番号検索では「一致する本が1冊しかないと分かっているから」List<Book>は不要
    //同じ番号の本が複数存在することはないため（データ的に一意＝unique）
    for (Book book : bookList) {
      if (book.getNumber() == number) {
        System.out.println(book);
        return book;//番号がヒットしたら即その本を返して処理終了。
      }
    }
    System.out.println("該当する番号の本はありません。");
    //if文の中にreturnがあるため、ifがfalseの場合はelseがなくても実行される。
    return null;
  }
}

