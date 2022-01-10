package baseball.game;

public class GameResult {
    private int strike = 0;
    private int ball = 0;
    public GameResult(SwingCount swingCount) {
        this.strike = swingCount.getStrikeCnt();
        this.ball = swingCount.getBallCnt();
    }

    public boolean getResult() {
        if (strike == 3) {
            return threeStrike();
        }
        if (strike == 0 && ball == 0) {
            return nothing();
        }

        return strikeAndBall();
    }

    public boolean threeStrike() {
        System.out.println("3스트라이크 게임 끝");
        return true;
    }

    public boolean nothing() {
        System.out.println("낫싱");
        return false;
    }

    public boolean strikeAndBall() {
        StringBuilder sb = new StringBuilder();
        if (strike != 0) {
            sb.append(strike + "스트라이크 ");
        }
        if (ball != 0) {
            sb.append(ball + "볼");
        }
        System.out.println(sb.toString());
        return false;
    }

}
