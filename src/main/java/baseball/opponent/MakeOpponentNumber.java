package baseball.opponent;

import java.util.ArrayList;
import java.util.List;

public class MakeOpponentNumber {
    private List<Integer> list;

    public MakeOpponentNumber() {
        list = new ArrayList<>();
        run();
    }

    public void run() {
        while (list.size() < 3) {
            appendNewNumber();
        }
    }

    public void appendNewNumber() {
        ExtractRandomNumber number = new ExtractRandomNumber();
        int newNumber = number.getRandomNumber();

        CheckDuplicateNumber checkDuplicateNumber = new CheckDuplicateNumber();

        if (!checkDuplicateNumber.isDuplicateNumber(list, newNumber)) {
            list.add(newNumber);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public void printList() {
        for (int i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
