import java.util.Scanner;

/**
 * Kukuは、九九の問題をランダムに10個表示して
 * その正解数と正解率を表示するプログラムである。
 */
public class Kuku {
    /** 表示する問題の個数 */
    public static final int MAX_QUESTION = 10;

    /**
     * 九九の問題をMAX_QUESTION回繰り返して出題する。
     * 最後に正答率を表示する。
     */
    public static void main(String[] args) {
        int goodAnswers = 0; // 正答の個数
        System.out
                .println("これから九九の問題を" + MAX_QUESTION + "問出します。");

        //  以下、問題を繰り返し表示し、ユーザーからの解答を判断する。
        //  その後、正答の数を数える。
        for (int i = 0; i < MAX_QUESTION; i++) {
            boolean ok = showQuestion(i + 1);
            if (ok) {
                goodAnswers++;
            }
        }
        double rate = goodAnswers * 100.0 / MAX_QUESTION;
        System.out.println();
        System.out.println("問題は" + MAX_QUESTION + "問ありました。");
        System.out.println("正しく答えられたのは" + goodAnswers + "問で、");
        System.out.println(
                "間違ってしまったのは" + (MAX_QUESTION - goodAnswers) + "問です。");
        System.out.println("正答率は" + rate + "％です。");
        System.out.println();
        System.out.println("お疲れ様。");
    }

    /**
     * showQuestionは九九の問題を１問出し、答えを待つ。
     * 正答、誤答の別を表示する。
     * 正答の場合はtrueを返す。
     */
    public static boolean showQuestion(int questno) {
        int x = (int) (Math.random() * 9) + 1;
        int y = (int) (Math.random() * 9) + 1;
        System.out.println(
                "[第" + questno + "問] " + x + " × " + y + " ＝ ？");
        String line = new Scanner(System.in).nextLine();
        int result = Integer.parseInt(line);
        if (x * y == result) {
            System.out.println("はい、正しいです。");
            return true;
        } else {
            System.out.println("残念、まちがいです。");
            return false;
        }
    }

}
