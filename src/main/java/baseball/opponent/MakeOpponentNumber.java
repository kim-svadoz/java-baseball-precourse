package baseball.opponent;

import java.util.ArrayList;
import java.util.List;

public class MakeOpponentNumber {

    private List<Integer> list;
    public MakeOpponentNumber() {
        run();
    }

    public void run() {
        list = new ArrayList<>();
        MakeThreeNumber();
    }

    public List<Integer> MakeThreeNumber() {
        while (list.size() < 3) {
            int num = insertNewNumber();

            if (num != 0) {
                list.add(num);
            }
        }
        //printList();
        return list;
    }

    public int insertNewNumber() {
        ExtractRandomNumber number = new ExtractRandomNumber();
        int newNumber = number.RANDOMNUM;
        //System.out.println("newNumber::" + newNumber);

        CheckDuplicateNumber checkDuplicateNumber = new CheckDuplicateNumber();

        if (!checkDuplicateNumber.checkDuplicateNumber(list, newNumber)) {
            return 0;
        }
        return newNumber;
    }

    public List<Integer> getList() {
        return list;
    }

    public void printList() {
        for (int i : list) {
            System.out.print(i+" ");
        }
        System.out.println("======");
    }
}
