package resources;

import values.Card;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LoseA {

	private boolean value;
    public LoseA() {
    }

    public boolean getValue() {
        return this.value;
    }
    
    public void updateHandsA(List<Card> handsA) {
    	this.value = true;
        for (Card card : handsA) {
            if (!card.isFace()) {
            	this.value = false;
                break;
            }
        }

    }
}