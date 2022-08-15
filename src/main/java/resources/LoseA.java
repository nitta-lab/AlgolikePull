package resources;

import values.Card;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LoseA {
	boolean value;
	
    public LoseA() {
    	
    }

    public boolean getValue() {
        return value;
    }
    
    void updateHandsA (List <Card> handsA) {
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