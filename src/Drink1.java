import java.util.Scanner;

/** P110 switch文の利用 */
public class Drink1 {

  public static void main(String[] args) {
    System.out.println("飲み物は何が好きですか？");
    System.out.println("1 オレンジジュース");
    System.out.println("2 コーヒー");
    System.out.println("3 どちらでもない");
    System.out.println("1,2,3のどれかを選んでください。");
    String line = new Scanner(System.in).nextLine();
    int n = Integer.parseInt(line);
    switch (n) {
    case 1:
      System.out.println("オレンジジュースです。");
      break;
    case 2:
      System.out.println("コーヒーです。");
      break;
    default:
      System.out.println("どちらでもありません。");
      break;
    }
  }
}