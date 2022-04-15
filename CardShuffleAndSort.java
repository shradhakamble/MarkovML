import dto.StandardDeckOfCards;

/*
* Create a standard library to represent a deck of the cards and perform operations like
*   - shuffleCards()
*   - sortCards()
*
* input 52 cards of four types
*   Clubs, Diamonds, Hearts, Spades
*   each type 13 card A, 1 ,2,3,4,5,6,7,8,9,10,J,Q,K
*
*/
public class CardShuffleAndSort {
    public static void main(String[] args) {

        // create our deck
        StandardDeckOfCards deck = new StandardDeckOfCards();

        // shuffle the deck 4 times
        deck.shuffleCards(4);
        System.out.println("Shuffled list of cards:");
        System.out.println(deck.getCards());

        // sort the deck
        deck.sortCards();
        System.out.println("Sorted List of Cards:");
        System.out.println(deck.getCards());
    }


}
