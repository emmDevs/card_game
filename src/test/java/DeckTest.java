import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Player player1;

    @Before
    public void setUp(){
        deck = new Deck();
        player1 = new Player("Emma");
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCardsInDeck());
    }

    @Test
    public void canPopulateDeckWith52Cards(){
        deck.populateDeck();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void canShuffleDeck(){
        deck.populateDeck();
        System.out.println(deck.getCards());
        deck.shuffleCards();
        System.out.println(deck.getCards());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard(0, player1);
        assertEquals(51, deck.countCardsInDeck());
    }


}
