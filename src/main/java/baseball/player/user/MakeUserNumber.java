package baseball.player.user;

import baseball.player.MakeNumber;
import java.util.ArrayList;
import java.util.List;
import nextstep.utils.Console;

public class MakeUserNumber implements MakeNumber{

    private List<Integer> list;
    private String line = "";

    public static MakeUserNumber getUserNumber() {
        return new MakeUserNumber();
    }

    public MakeUserNumber() {
        list = new ArrayList<>();
        run();
    }

    @Override
    public void run() {
        untilConsoleIsCorrect(setConsole());
        appendNumber();
    }

    @Override
    public void appendNumber() {
        for (char c : line.toCharArray()) {
            list.add(c - '0');
        }
    }

    public void untilConsoleIsCorrect(String line) {
        while (UserConsoleError.isError(line)) {
            line = setConsole();
        }
    }

    public String setConsole() {
        System.out.print("숫자를 입력해 주세요 : ");
        try {
            line = Console.readLine();
        } catch (IllegalArgumentException e) {

        }
        return line;
    }

    public List<Integer> getList() {
        return list;
    }
}
