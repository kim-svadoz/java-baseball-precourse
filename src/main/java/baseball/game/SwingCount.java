package baseball.game;

public class SwingCount {
    private int strikeCnt = 0;
    private int ballCnt = 0;

    private static SwingCount instance = null;

    private SwingCount() {
    }

    public static SwingCount getInstance() {
        if (instance == null) {
            instance = new SwingCount();
        }
        return instance;
    }

    public void checkStrikeOrBall(boolean ref) {
        if (ref) {
            this.strikeCnt++;
            return;
        }
        this.ballCnt++;
    }

    public int getStrikeCnt() {
        return this.strikeCnt;
    }
    public int getBallCnt() {
        return this.ballCnt;
    }
    public void initCnt() {
        this.strikeCnt = 0;
        this.ballCnt = 0;
    }
}
