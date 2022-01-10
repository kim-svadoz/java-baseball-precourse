package baseball.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayerConsoleError {
    public PlayerConsoleError() {}

    public static boolean isError(String line) {
        line = line.trim();

        if (NoneThreeDigitsError(line) || NoneAlphabeticError(line) || DuplicateNumberError(line)) {
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

    private static boolean NoneThreeDigitsError(String line) {
        if (line.length() != 3) {
            System.out.println("[ERROR] 정확히 3자리 숫자를 입력해 주세요.");
            return true;
        }
        return false;
    }

    private static boolean NoneAlphabeticError(String line) {
        boolean isNumeric = line.chars().allMatch(Character::isDigit);

        if (!isNumeric) {
            System.out.println("[ERROR] 숫자 이외의 문자는 적절하지 않습니다.");
            return true;
        }
        return false;
    }
}
