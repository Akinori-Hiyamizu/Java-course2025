package kouza.exercise3_5;

import java.util.Scanner;

public class Kadai3_5_2 {
  //配列とリストまたはStreamAPIを使用して、学生の名前と点数を管理するシステムを作成
  //名前の追加、削除、点数の更新、平均点の計算ができるようにする。
  //処理をループさせるにはWhile文を使用する。

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentsManager manager = new StudentsManager();

    while (true) {
      //ＰＲ練習用に作成
      System.out.println("\n====== ＭＥＮＵ =====");
      System.out.println("１．学生を追加");
      System.out.println("２．学生を削除");
      System.out.println("３．点数を更新");
      System.out.println("４．平均点を計算");
      System.out.println("５．全学生の情報を表示");
      System.out.println("６．終了");
      System.out.print("選択してください：");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("名前を入力：");
          String name = scanner.nextLine();
          System.out.print("点数を入力：");
          int score = scanner.nextInt();
          scanner.nextLine();
          manager.addStudent(name, score);
          break;
        case 2:
          System.out.print("削除する学生の名前を入力：");
          String delname = scanner.nextLine();
          if (manager.removeStudent(delname)) {
            System.out.println("削除しました。");
          } else {
            System.out.println("見つかりませんでした。");
          }
          break;
        case 3:
          System.out.print("更新する学生の名前を入力：");
          String updname = scanner.nextLine();
          System.out.print("新しい点数を入力：");
          int newscore = scanner.nextInt();
          scanner.nextLine();
          if (manager.updateScore(updname, newscore)) {
            System.out.println("更新しました。");
          } else {
            System.out.println("学生が見つかりませんでした。");
          }
          break;
        case 4:
          double aveg = manager.calcurateAverage();
          System.out.println("平均点：" + aveg);
          break;
        case 5:
          manager.showAllStudents();
          break;
        case 6:
          System.out.println("終了します。");
          scanner.close();
          return;
        default:
          System.out.println("無効な選択です。１～６を選択してください。");
      }
    }
  }
}
