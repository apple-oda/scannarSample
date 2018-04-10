import java.util.Scanner;

/** P90 if文の利用 */
public class Kasa1 {

  public static void main(String[] args) {
    System.out.println("降水確率を入力してください。");
    String line = new Scanner(System.in).nextLine();
    int n = Integer.parseInt(line);
    System.out.println("降水確率は" + n + "％です。");
    if (n >= 50) {
      System.out.println("傘を忘れずにね。");
    } else {
      System.out.println("傘はいりません。");
    }
    System.out.println("いってらっしゃい。");
  }

}