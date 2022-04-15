package dto;

import enums.Ranks;
import enums.Suits;
import utils.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StandardDeckOfCards {

    private List<Card> standardDeckOfCards = new ArrayList<>();

    public StandardDeckOfCards() {
        int rankValue = 0;
        for (Suits suits : Suits.values()) {
            for (Ranks ranks : Ranks.values()) {
                standardDeckOfCards.add(new Card(suits, ranks, ++rankValue));
            }
        }
    }

    public void shuffleCards(int shuffleCount){
        Random random = new Random();
        // random shuffling by the dealer himself
        IntStream.range(0,4).forEach( i -> {
            swapCards(random.nextInt(52));
        });
        //asking another random player to cut the card int two
        swapCards(random.nextInt(52));
    }

    // swap the lower set of cards and keep it on top
    private void swapCards(int cutCount) {
        List<Card> cards = standardDeckOfCards.subList(cutCount, 52);
        cards.addAll(standardDeckOfCards.subList(0 , cutCount));
        standardDeckOfCards = cards;
    }

    public void sortCards() {
        // sort based on rankValue during insertion
        QuickSort.sort(standardDeckOfCards,0,51);
    }

    public List<Card> getCards() {
        return this.standardDeckOfCards;
    }
}
