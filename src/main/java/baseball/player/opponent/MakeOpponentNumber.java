package baseball.player.opponent;

import baseball.game.Round;
import baseball.player.MakeNumber;
import java.util.ArrayList;
import java.util.List;

public class MakeOpponentNumber implements MakeNumber{

    private List<Integer> list;

    public static MakeOpponentNumber getComputerNumber() {
        return new MakeOpponentNumber();
    }

    public MakeOpponentNumber() {
        list = new ArrayList<>();
        run();
    }

    @Override
    public void run() {
        while (list.size() < Round.getRound()) {
            appendNumber();
        }
    }

    @Override
    public void appendNumber() {
        int newNumber = ExtractRandomNumber.extractRandomNumber().getRandomNumber();

        if (!CheckDuplicateNumber.isDuplicateNumber(list, newNumber)) {
            list.add(newNumber);
        }
    }

    public List<Integer> getList() {
        return list;
    }
}