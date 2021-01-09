import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    @Before
    public void setUp(){
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player("Emma");
        player2 = new Player("Jono");
        player3 = new Player("Olly");
        player4 = new Player("Aimee");
    }

    @Test
    public void playerHasName(){
        assertEquals("Emma", player1.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player2.countCardsInHand());
    }

    @Test
    public void canBeDealtACard(){
        deck.dealCard(0, player2);
        assertEquals(1, player2.countCardsInHand() );
    }

}
