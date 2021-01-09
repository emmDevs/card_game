import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Game game;
    Player player1;
    Player player2;
    Player player3;
    Player player4;


    @Before
    public void setUp(){
        deck = new Deck();
        deck.populateDeck();
        game = new Game(deck);
        player1 = new Player("Emma");
        player2 = new Player("Jono");
        player3 = new Player("Olly");
        player4 = new Player("Aimee");
    }

    @Test
    public void gameStartsWithNoPlayers(){
        assertEquals(0, game.getNumberOfPlayers());
    }

    @Test
    public void canAddPlayersToGame(){
        game.addPlayer(player1);
        assertEquals(1, game.getNumberOfPlayers());
    }

    @Test
    public void canDealACardToEachPlayerInGame(){
//        deck.populateDeck();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
        game.dealCardToMultiplePlayers(0);
        assertEquals(1, player1.countCardsInHand());
        assertEquals(1, player2.countCardsInHand());
        assertEquals(1, player3.countCardsInHand());
        assertEquals(1, player4.countCardsInHand());
    }

}
