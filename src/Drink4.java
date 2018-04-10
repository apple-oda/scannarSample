import java.util.Scanner;

public class Drink4 {

    public static void main(String[] args) {
        System.out.println("飲み物は何が好きですか？");
        System.out.println("オレンジジュース(orange)");
        System.out.println("コーヒー(coffee)");
        System.out.println("どちらでもない(other)");
        System.out.println("orange,coffee,otherのどれかを選んでください。");
        String line = new Scanner(System.in).nextLine();
        switch (line) {
        case "orange":
            System.out.println("オレンジジュースです。");
            break;
        case "coffee":
            System.out.println("コーヒーです。");
            break;
        default:
            System.out.println("どちらでもありません。");
            break;
        }
    }
}
