package baseball.game;

import baseball.player.opponent.MakeOpponentNumber;
import baseball.player.user.MakeUserNumber;
import java.util.List;

public class SwingBat {

    private SwingCount swingCount = SwingCount.getInstance();

    private List<Integer> computerNumbers;
    private List<Integer> userNumbers;

    public static SwingBat hitTheBall(List<Integer> computerNumbers, List<Integer> userNumbers) {
        return new SwingBat(computerNumbers, userNumbers);
    }

    public SwingBat(List<Integer> computerNumbers, List<Integer> userNumbers) {
        this.computerNumbers = computerNumbers;
        this.userNumbers = userNumbers;
        swingCount.initCnt();
    }

    public void swing(int round) {
        int myball = userNumbers.get(round);

        if (computerNumbers.get(round) == myball) {
            swingCount.increaseStrikeAndBallCnt(true);
            return;
        }
        if (computerNumbers.contains(myball)) {
            swingCount.increaseStrikeAndBallCnt(false);
        }
    }

    public boolean printResult() {
        return GameResult.from(swingCount).getResult();
    }
}
