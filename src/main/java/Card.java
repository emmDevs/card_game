public class Card {

    private SuitType suitType;
    private RankType rankType;

    public Card(SuitType suitType, RankType rankType){
        this.suitType = suitType;
        this.rankType = rankType;
    }

    public SuitType getSuit(){
        return this.suitType;
    }

    public RankType getRank() {
        return this.rankType;
    }

    public int getValueFromEnum() {
        return this.rankType.getValue();
    }

//    public Card populateDeck() {
//        for (rank : rankType){
//            for(suit : suitType){
//                Card createdCard = new Card(suitType, rankType);
//            }
//            this.card.put(createdCard);
//        }
//    }

}
