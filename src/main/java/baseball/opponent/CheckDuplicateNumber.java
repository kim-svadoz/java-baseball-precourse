package baseball.opponent;

import java.util.List;

public class CheckDuplicateNumber {

    public CheckDuplicateNumber() {

    }

    public boolean isDuplicateNumber(List<Integer> list, int newNumber) {
        if (list.contains(newNumber)) {
            return true;
        }
        return false;
    }
}
