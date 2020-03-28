import static org.junit.Assert.*;
import org.junit.Test;

public class RockScissorsPaperTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockScissorsPaper.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RockScissorsPaper.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RockScissorsPaper.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockScissorsPaper.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RockScissorsPaper.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RockScissorsPaper.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockScissorsPaper.rps("scissors", "scissors"));
        assertEquals("Draw!", RockScissorsPaper.rps("paper", "paper"));
        assertEquals("Draw!", RockScissorsPaper.rps("rock", "rock"));
    }

}