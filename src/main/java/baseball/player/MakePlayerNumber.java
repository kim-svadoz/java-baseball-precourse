package baseball.player;

import java.util.ArrayList;
import java.util.List;
import nextstep.utils.Console;

public class MakePlayerNumber {
    private List<Integer> list;
    private String line = "";

    public MakePlayerNumber() {
        list = new ArrayList<>();
        run();
    }

    public void run() {
        convertString2IntegerList(setConsole());
    }

    public void convertString2IntegerList(String line) {
        while (PlayerConsoleError.isError(line)) {
            line = setConsole();
        }

        for (char c : line.toCharArray()) {
            list.add(c - '0');
        }
    }

    public String setConsole() {
        System.out.print("숫자를 입력해 주세요 : ");
        return line = Console.readLine();
    }

    public List<Integer> getList() {
        return list;
    }
}
