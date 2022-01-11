package baseball.player.opponent;

import nextstep.utils.Randoms;

public class ExtractRandomNumber {

    private final int RANDOMNUM;

    public static ExtractRandomNumber extractRandomNumber() {
        return new ExtractRandomNumber();
    }

    public ExtractRandomNumber() {
        RANDOMNUM = Randoms.pickNumberInRange(1, 9);
    }

    public int getRandomNumber() {
        return RANDOMNUM;
    }
}
