package utils;

import dto.Card;

import java.util.List;

public class QuickSort {
    private static int partition(List<Card> cards, int low, int high) {
        Card pivot = cards.get(high);
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (cards.get(j).getRankValue() <= pivot.getRankValue()) {
                i++;
                // swap card.get(i) and card.get(j)
                Card temp = cards.get(i);
                cards.set(i, cards.get(j));
                cards.set(j, temp);
            }
        }

        // swap card.get(i+1) and card.get(high) (or pivot)
        Card temp = cards.get(i + 1);
        cards.set(i + 1, cards.get(high));
        cards.set(high, temp);
        return i + 1;
    }

    public static void sort(List<Card> cards, int low, int high) {
        if (low < high) {
            int pi = partition(cards, low, high);
            // Recursively sort elements before partition and after partition
            sort(cards, low, pi - 1);
            sort(cards, pi + 1, high);
        }
    }
}