import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canPlayGame__oneWinner(){
        player1.addCardToHand(new Card(SuitType.HEARTS, RankType.ACE));
        player2.addCardToHand(new Card(SuitType.CLUBS, RankType.FIVE));
        player3.addCardToHand(new Card(SuitType.DIAMONDS, RankType.KING));
        player4.addCardToHand(new Card(SuitType.SPADES, RankType.EIGHT));
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
        game.playGame(0);
        assertEquals(10, game.getWinningScore());

    }

    @Test
    public void canDeclareWinner__OneWinner(){
        player1.addCardToHand(new Card(SuitType.HEARTS, RankType.ACE));
        player2.addCardToHand(new Card(SuitType.CLUBS, RankType.FIVE));
        player3.addCardToHand(new Card(SuitType.DIAMONDS, RankType.KING));
        player4.addCardToHand(new Card(SuitType.SPADES, RankType.EIGHT));
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
        game.playGame(0);
        assertEquals("Congratulations you won!", game.declareWinner(0));
    }

}
