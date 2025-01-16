import java.util.Scanner;

public class Player {
    Card turn(Card[] cards) {
        int rnd = (int)(Math.random() * cards.length);
        return cards[rnd];
    }

    String answer() {
        // h または l を入力する
        System.out.println("High(h) or Low(l)?");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
