package baseball.game;

import baseball.opponent.MakeOpponentNumber;
import baseball.player.ConsoleAndSwing;
import baseball.player.MakePlayerNumber;
import java.util.List;
import nextstep.utils.Console;

public class Start {
    MakeOpponentNumber makeOpponentNumber;
    public Start() {
        do {
            newGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        } while (textConsoleIfWantNewGame(Console.readLine()) == 0);
    }

    public int textConsoleIfWantNewGame(String userConsole) {
        if (userConsole.equals("1")) {
            return 0;
        } else if (userConsole.equals("2")) {
            return 1;
        }
        return -1;
    }

    public void newGame() {
        // 컴퓨터의 무작위 숫자 3자리를 가져온다.
        makeOpponentNumber = new MakeOpponentNumber();

        // 플레이어의 숫자를 입력받고 게임을 진행한다.
        ConsoleAndSwing consoleAndSwing = new ConsoleAndSwing(makeOpponentNumber);

        // 게임 결과를 확인한다.
        boolean result = consoleAndSwing.getResult();

        while (!result) {
            consoleAndSwing = new ConsoleAndSwing(makeOpponentNumber);
            result = consoleAndSwing.getResult();
        }
    }
}
