import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCardsInDeck() {
        return this.cards.size();
    }

    public void populateDeck(){
        Card createdCard = null;
        for(SuitType suits : SuitType.values()) {
            for (RankType ranks : RankType.values()) {
                createdCard = new Card(suits, ranks);
                this.cards.add(createdCard);
            }

        }
    }

    public ArrayList<Card> shuffleCards(){
        Collections.shuffle(this.cards);
        return this.cards;

    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void dealCardToOnePlayer(int index, Player player) {
        if (countCardsInDeck() > 0) {
            Card dealtCard = this.cards.remove(index);
            player.addCardToHand(dealtCard);
        }
    }
}


