import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Player> winners;
    private Deck deck;

    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.winners = new ArrayList<Player>();
        this.deck = deck;

    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealCardToMultiplePlayers(int index){
        deck.populateDeck();
        Card removedCard = deck.removeCardFromDeck(index);
        for (Player player : this.players) {
            if(deck.countCardsInDeck() > getNumberOfPlayers()){
                player.addCardToHand(removedCard);
            }
        }
    }


}
