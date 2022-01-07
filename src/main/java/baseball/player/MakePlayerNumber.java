package baseball.player;

import nextstep.utils.Console;

public class MakePlayerNumber {

    public MakePlayerNumber() {
        playerConsole();
    }

    public String playerConsole() {
        String line = Console.readLine();
        System.out.println(line);
        return line;
    }
}
