package cardSuit;

public enum Suits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int value;

    private Suits(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
