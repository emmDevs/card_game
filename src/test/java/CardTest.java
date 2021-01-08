import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp(){
        card = new Card(Suit.HEARTS, Rank.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }
}
