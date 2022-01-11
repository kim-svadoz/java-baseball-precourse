package baseball.player.user;

import baseball.game.Round;
import java.util.HashSet;
import java.util.Set;

public class UserConsoleError {

    public UserConsoleError() {}

    public static boolean isError(String line) {
        if (InCorrectLengthError(line) || NotAlphabeticError(line) || DuplicateNumberError(line)) {
            return true;
        }

        return false;
    }

    private static boolean DuplicateNumberError(String line) {
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < line.length(); i++) {
            String s = line.substring(i, i + 1);
            if (hashSet.contains(s)) {
                System.out.println("[ERROR] 서로 다른 숫자로 입력해주세요.");
                return true;
            }
            hashSet.add(s);
        }

        return false;
    }

    private static boolean InCorrectLengthError(String line) {
        if (line.length() != Round.getRound()) {
            System.out.println("[ERROR] 정확히 "+Round.getRound()+"자리 숫자를 입력해 주세요.");
            return true;
        }
        return false;
    }

    private static boolean NotAlphabeticError(String line) {
        boolean isNumeric = line.chars().allMatch(Character::isDigit);

        if (!isNumeric) {
            System.out.println("[ERROR] 숫자 이외의 문자는 적절하지 않습니다.");
            return true;
        }
        return false;
    }
}
