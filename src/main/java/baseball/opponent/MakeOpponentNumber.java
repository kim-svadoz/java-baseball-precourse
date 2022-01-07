package baseball.opponent;

import java.util.ArrayList;
import java.util.List;

public class MakeOpponentNumber {

    List<Integer> list;
    public MakeOpponentNumber() {
        list = new ArrayList<>();
        run();
    }

    public void run() {
        MakeThreeNumber();
    }

    public List<Integer> MakeThreeNumber() {
        while (list.size() < 3) {
            int num = insertNewNumber();

            if (num != 0) {
                list.add(num);
            }
        }
        System.out.println("make number list complete");
        printList();
        return list;
    }

    public int insertNewNumber() {
        ExtractRandomNumber number = new ExtractRandomNumber();
        int newNumber = number.RANDOMNUM;
        System.out.println("newNumber::" + newNumber);

        CheckDuplicateNumber checkDuplicateNumber = new CheckDuplicateNumber();

        if (!checkDuplicateNumber.checkDuplicateNumber(list, newNumber)) {
            return 0;
        }
        return newNumber;
    }

    public void printList() {
        for (int i : list) {
            System.out.print(i+" ");
        }
    }
}
