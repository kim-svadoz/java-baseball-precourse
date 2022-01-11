package baseball.game;

import baseball.player.opponent.MakeOpponentNumber;
import baseball.player.user.MakeUserNumber;
import java.util.List;
import nextstep.utils.Console;

public class BaseballGame {

    private static BaseballGame game = null;

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
        } while (text1AtConsoleIfWantNewGame(Console.readLine()));
    }

    public boolean text1AtConsoleIfWantNewGame(String userConsole) {
        if (userConsole.equals("1")) {
            return true;
        }
        return false;
    }

    public void newGame() {
        // 컴퓨터의 무작위 숫자 3자리를 가져온다.
        List<Integer> computerNumbers = MakeOpponentNumber.getComputerNumber().getList();

        // 플레이어의 콘솔 숫자 3자리를 가져온다.
        List<Integer> userNumbers = MakeUserNumber.getUserNumber().getList();

        // 게임을 진행하고 결과를 확인한다.
        Swing swing = Swing.contrastEachOther(computerNumbers, userNumbers, Round.getRound());
        boolean result = swing.getResult();

        while (!result) {
            userNumbers = MakeUserNumber.getUserNumber().getList();
            swing = Swing.contrastEachOther(computerNumbers, userNumbers, Round.getRound());
            result = swing.getResult();
        }
    }
}
