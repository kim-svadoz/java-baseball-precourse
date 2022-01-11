package baseball.game;

import java.util.List;

public class Swing {

    private SwingBat swing;

    public static Swing contrastEachOther(List<Integer> computerNumbers, List<Integer> userNumbers, int round) {
        return new Swing(computerNumbers, userNumbers, round);
    }

    public Swing(List<Integer> computerNumbers, List<Integer> userNumbers, int round) {
        swing = SwingBat.hitTheBall(computerNumbers, userNumbers);
        for (int i = 0; i < round; i++) {
            swing.swing(i);
        }
    }

    public boolean getResult() {
        return swing.printResult();
    }
}
