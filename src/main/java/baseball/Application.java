package baseball;

import baseball.game.BaseballGame;
import baseball.game.Round;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        BaseballGame baseballGame = BaseballGame.getInstance();
        Round.from(3);
        baseballGame.start();
    }
}
