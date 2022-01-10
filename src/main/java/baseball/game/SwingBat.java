package baseball.game;

import java.util.List;

public class SwingBat {
    SwingCount swingCount = SwingCount.getInstance();
    public SwingBat() {
        swingCount.initCnt();
    }

    public void swing(List<Integer> computer, List<Integer> player, int round) {
        int myball = player.get(round);

        if (computer.get(round) == myball) {
            swingCount.checkStrikeOrBall(true);
            return;
        }
        if (computer.contains(myball)) {
            swingCount.checkStrikeOrBall(false);
        }
    }

    public boolean printResult() {
        int s = swingCount.getStrikeCnt();
        int b = swingCount.getBallCnt();

        if (s == 3) {
            System.out.println("3스트라이크 게임 끝");
            return true;
        }

        if (s == 0 && b == 0) {
            System.out.println("낫싱");
            return false;
        }

        StringBuilder sb = new StringBuilder();
        if (s != 0) {
            sb.append(s + "스트라이크 ");
        }
        if (b != 0) {
            sb.append(b + "볼");
        }
        System.out.println(sb.toString());
        return false;
    }
}
