package baseball.player;

import java.util.ArrayList;
import java.util.List;
import nextstep.utils.Console;

public class MakePlayerNumber {

    List<Integer> list;
    String line = "";

    public MakePlayerNumber() {
        run();
    }

    public void run() {
        list = new ArrayList<>();
        System.out.print("숫자를 입력해 주세요 : ");
        line = Console.readLine();
        String2IntegerList(line);
    }

    public List<Integer> String2IntegerList(String line) {
        PlayerConsoleError playerConsoleError = new PlayerConsoleError();

        while (playerConsoleError.isError(line)) {
            System.out.print("숫자를 입력해 주세요 : ");
            line = Console.readLine();
        }

        for (char c : line.toCharArray()) {
            list.add(c - '0');
        }
        return list;
    }

    public List<Integer> getList() {
        return list;
    }
}
