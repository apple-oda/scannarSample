import java.util.Scanner;

public class Copy1 {

  public static void main(String[] args) {
    String line = new Scanner(System.in).nextLine();
    while (true) {
      System.out.println(line);
      line = new Scanner(System.in).nextLine();
    }
  }
}
