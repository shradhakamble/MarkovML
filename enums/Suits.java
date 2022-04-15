package enums;

public enum Suits {

    CLUBS(Colors.BLACK),
    DIAMONDS(Colors.RED),
    HEARTS(Colors.RED),
    SPADES(Colors.BLACK);

    private final Colors colors;

    Suits(Colors color) {
        this.colors = color;
    }

    public Colors getColors() {
        return colors;
    }
}
