package baseball.opponent;

import java.util.List;

public class CheckDuplicateNumber {

    public CheckDuplicateNumber() {

    }

    public boolean checkDuplicateNumber(List<Integer> list, int newNumber) {
        if (list.contains(newNumber)) {
            return false;
        }
        return true;
    }
}
