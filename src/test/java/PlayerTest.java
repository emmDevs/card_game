import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;

    @Before
    public void setUp(){
        player1 = new Player("Emma");
        player2 = new Player("Jono");
        player3 = new Player("Olly");
        player4 = new Player("Aimee");
    }

    @Test
    public void playerHasName(){
        assertEquals("Emma", player1.getName());
    }
}
