package resources;

import java.util.List;

import values.Card;

public class LoseA {
    //HandsA handsA;
    boolean value;

    //public LoseA(HandsA handsA) {
    public LoseA() {
        //this.handsA = handsA;
    }

    boolean getValue() {
        return value;
    }
    
    public void updateHandsA(List<Card> handsA) {
        boolean result = true;
        for (Card card : this.handsA.getValue()) {
            if (!card.isFace()) {
                result = false;
                break;
            }
        }
        return result;
    }
}