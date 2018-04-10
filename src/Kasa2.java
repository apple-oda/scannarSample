import java.util.Scanner;

/** P92 else if文の利用 */
public class Kasa2 {

  public static void main(String[] args) {
    System.out.println("降水確率を入力してください。");
    String line = new Scanner(System.in).nextLine();
    int n = Integer.parseInt(line);
    System.out.println("降水確率は" + n + "％です。");
    if (n > 100) {
      System.out.println("降水確率は0～100の間ですよ。");
    } else if (n >= 50) {
      System.out.println("傘を忘れずにね。");
    } else {
      System.out.println("傘はいりません。");
    }
    System.out.println("いってらっしゃい。");
  }
}
