
public class RockScissorsPaper {

    public static String rps(String p1, String p2) {

        if ("scissors".equals(p1) && "rock".equals(p2)) {
            return "Player 2 won!";
        }
        if ("paper".equals(p1) && "scissors".equals(p2)) {
            return "Player 2 won!";
        }
        if ("rock".equals(p1) && "paper".equals(p2)) {
            return "Player 2 won!";
        }

        if ("scissors".equals(p2) && "rock".equals(p1)) {
            return "Player 1 won!";
        }
        if ("paper".equals(p2) && "scissors".equals(p1)) {
            return "Player 1 won!";
        }
        if ("rock".equals(p2) && "paper".equals(p1)) {
            return "Player 1 won!";
        }
        if (p1 == p2) {
            return "Draw!";
        }
        return p1;
    }
}
