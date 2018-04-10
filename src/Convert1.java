import java.util.Scanner;

public class Convert1 {

  public static void main(String[] args) {
    while (true) {
      String line = new Scanner(System.in).nextLine();
      String s = line.replace('。', '.');
      s = s.replace('、', ',');
      System.out.println(s);
    }
  }
}