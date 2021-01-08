import javax.smartcardio.Card;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> Cards;

    public Deck(){
        this.Cards = new ArrayList<Card>();
    }

    public int countCardsInDeck() {
        return this.Cards.size();
    }
}

