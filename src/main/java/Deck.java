import java.util.ArrayList;

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
}

