/** P74 Math.randomメソッドの利用 */
public class Random {

  public static void main(String[] args) {
    int x = (int) (Math.random() * 9) + 1;
    int y = (int) (Math.random() * 9) + 1;
    System.out.println("[問題] " + x + " × " + y + " ＝ ？");
  }
}
