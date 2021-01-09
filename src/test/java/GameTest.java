import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    Player player4;


    @Before
    public void setUp(){
        game = new Game();
        deck = new Deck();
        deck.populateDeck();
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

}
