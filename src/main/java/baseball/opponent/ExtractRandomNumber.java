package baseball.opponent;

import nextstep.utils.Randoms;

public class ExtractRandomNumber {

    final int RANDOMNUM;

    public ExtractRandomNumber() {
        RANDOMNUM = Randoms.pickNumberInRange(1, 9);

    }

    public int retNumber() {
        return RANDOMNUM;
    }
}
