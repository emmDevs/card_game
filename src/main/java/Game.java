import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Player> winners;
    private Deck deck;
    private int winningScore;

    public Game(Deck deck) {
        this.players = new ArrayList<Player>();
        this.winners = new ArrayList<Player>();
        this.deck = deck;
        this.winningScore = 0;

    }

    public int getWinningScore(){
        return this.winningScore;
    }

    public int getNumberOfPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealCardToMultiplePlayers(int index) {
        deck.populateDeck();
        Card removedCard = deck.removeCardFromDeck(index);
        for (Player player : this.players) {
            if (deck.countCardsInDeck() > getNumberOfPlayers()) {
                player.addCardToHand(removedCard);
            }
        }
    }

    public void playGame(int index){
        for(Player player : this.players){
            if(player.getValueOfHand() > winningScore){
                winningScore = player.getValueOfHand();
            }
        }
        }
    }


//    public int playGame(int index) {
//        deck.populateDeck();
//        deck.shuffleCards();
//        dealCardToMultiplePlayers(index);
//        int winningScore = 0;
//        for (Player player : this.players) {
//            if (player.getValueOfHand() > winningScore) {
//                winningScore = player.getValueOfHand();
//                return winningScore;
//            }
//
//        }

//    public void playGame(int index){
//        for(Player player : this.players){
//            if(player.getValueOfHand() > winningScore){
//                winningScore = player.getValueOfHand();
//                }
//            }
//        }

//    public String declareWinner() {
//            for (Player player : this.players) {
//                if (player.getValueOfHand() == playGame(index)) {
//                    this.winners.add(player);
//                }
//                if (this.winners.size() > 1) {
//                    return "It is a tie";
//                } else {
//                    return "Congratulations you won!";
//                }
//            }
//
//        }