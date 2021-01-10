import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int countCardsInHand() {
        return this.hand.size();
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public int getValueOfHand(){
        int handValue = 0;
        for(Card card : this.hand){
            handValue += card.getValueFromEnum();
        }
        return handValue;
    }
}
