package baseball.game;

public class Round {

    private static int round = 0;
    private static Round instance = null;

    public Round(int round) {
        this.round = round;
    }

    public static Round from(int round) {
        if (instance == null) {
            instance = new Round(round);
        }
        return instance;
    }

    public static int getRound() {
        return round;
    }
}
