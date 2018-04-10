import java.util.Scanner;

public class HowOldAreYou {

  public static void main(String[] args) {
    System.out.println("あなたの名前を入力してください。");
    String line = new Scanner(System.in).nextLine();
    System.out.println(line + "さん、こんにちは。");

    System.out.println("年齢を入力してください。");
    line = new Scanner(System.in).nextLine();
    int age = Integer.parseInt(line);
    System.out.println(
        "いま" + age + "歳とすると、10年後は" + (age + 10) + "歳ですね。");
  }
}
