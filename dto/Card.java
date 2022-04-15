package dto;

import enums.Colors;
import enums.Ranks;
import enums.Suits;

public class Card {

    private final int rankValue;
    private final Ranks rank;
    private final Colors color;
    private final Suits suit;

    public Card(Suits suit, Ranks rank, int rankValue) {
        this.rank = rank;
        this.suit = suit;
        this.color = suit.getColors();
        this.rankValue = rankValue;
    }

    public int getRankValue() {
        return rankValue;
    }

    @Override
    public String toString() {
        return "dto.Card{" +
                "rankValue=" + rankValue +
                ", rank=" + rank +
                ", color=" + color +
                ", suit=" + suit +
                '}';
    }
}
