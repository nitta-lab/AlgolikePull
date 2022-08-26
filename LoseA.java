package resources;

import java.util.List;

import values.Card;

public class LoseA {

	boolean value;
	
    public LoseA() {
    }

    public boolean getValue() {
        return value;
    }

    public void updateHandsA(List<Card> handsA) {
    	boolean result = true;
        for (Card card : handsA) {
            if (!card.isFace()) {
                result = false;
                break;
            }
        }
        this.value = result;
    }
}