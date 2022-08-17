package resources;

import values.Card;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LoseA {
    private boolean value;

    public LoseA() {
    }

    public void updateHandsA(List<Card> handsA) {
        value = true;
        for (Card card : handsA) {
            if (!card.isFace()) {
                value = false;
                break;
            }
        }
    }

    public boolean getValue() {
        return value;
    }
}