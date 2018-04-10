import java.util.Scanner;

public class CopyLower {

    public static void main(String[] args) {
        while (true) {
            String line = new Scanner(System.in).nextLine();
            String s = line.toLowerCase();
            System.out.println(s);
        }
    }
}
