package baseball.player;

public class PlayerConsoleError {
    public PlayerConsoleError() {}

    public boolean isError(String line) {
        line = line.trim();
        if (line.length() != 3) {
            System.out.println("[ERROR] 정확히 3자리 숫자를 입력해 주세요.");
            return true;
        }

        boolean isNumeric = line.chars().allMatch(Character::isDigit);

        if (!isNumeric) {
            System.out.println("[ERROR] 숫자 이외의 문자는 적절하지 않습니다.");
            return true;
        }

        return false;
    }
}
