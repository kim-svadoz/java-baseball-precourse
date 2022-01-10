package baseball.game;

import baseball.opponent.MakeOpponentNumber;
import baseball.player.ConsoleAndSwing;
import nextstep.utils.Console;

public class BaseballGame {
    private static BaseballGame game = null;
    private MakeOpponentNumber makeOpponentNumber;

    public BaseballGame() {
    }

    public static BaseballGame getInstance() {
        if (game == null) {
            game = new BaseballGame();
        }
        return game;
    }

    public void start() {
        do {
            newGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        } while (text1AtConsoleIfWantNewGame(Console.readLine()) == 1);
    }

    public int text1AtConsoleIfWantNewGame(String userConsole) {
        if (userConsole.equals("1")) {
            return 1;
        }
        return 0;
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
