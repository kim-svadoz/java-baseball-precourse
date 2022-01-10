package baseball.game;

import baseball.opponent.MakeOpponentNumber;
import baseball.player.MakePlayerNumber;
import java.util.List;

public class SwingBat {
    private SwingCount swingCount = SwingCount.getInstance();
    private MakeOpponentNumber makeOpponentNumber;
    private MakePlayerNumber makePlayerNumber;
    public SwingBat(MakeOpponentNumber opponentNumber, MakePlayerNumber playerNumber) {
        this.makeOpponentNumber = opponentNumber;
        this.makePlayerNumber = playerNumber;
        swingCount.initCnt();
    }

    public void swing(int round) {
        int myball = makePlayerNumber.getList().get(round);

        if (makeOpponentNumber.getList().get(round) == myball) {
            swingCount.checkStrikeOrBall(true);
            return;
        }
        if (makeOpponentNumber.getList().contains(myball)) {
            swingCount.checkStrikeOrBall(false);
        }
    }

    public boolean printResult() {
        GameResult gameResult = new GameResult(swingCount);
        return gameResult.getResult();
    }
}
