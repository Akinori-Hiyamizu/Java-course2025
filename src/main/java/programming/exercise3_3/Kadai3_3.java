package programming.exercise3_3;

public class Kadai3_3 {
  //Javaの命名規則と学習方法
  //課題：図書管理システムの構築
  // 本の情報を持つオブジェクト（Bookクラス）
  // Bookクラス本の情報をまとめたListと検索機能を持つオブジェクト（Libraryクラス）を作る。
  // MainクラスからLibraryクラスの検索機能を呼び出せるようにする。

  public static void main(String[] args) {

    Library library = new Library();
    library.searchForTitle("夢");
    library.searchForAuthor("水野");
    library.searchForNumber(1);


  }

}
