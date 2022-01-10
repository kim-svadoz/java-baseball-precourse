package baseball.player;

import baseball.game.SwingBat;
import baseball.opponent.MakeOpponentNumber;

public class ConsoleAndSwing {
    SwingBat swing;
    MakePlayerNumber makePlayerNumber;
    public ConsoleAndSwing(MakeOpponentNumber makeOpponentNumber) {
        // 플레이어가 콘솔로 3자리를 입력한다.
        makePlayerNumber = new MakePlayerNumber();

        // 총 세번의 스윙을 한다.
        swing = new SwingBat();
        for (int i = 0; i < 3; i++) {
            swing.swing(makeOpponentNumber.getList(), makePlayerNumber.getList(), i);
        }
    }

    public boolean getResult() {
        return swing.printResult();
    }


}
