class Card {
    public enum Value {As, dwojka, trojka, czworka, piatka, szostka, siodemka, osemka, dziewiatka, dziesiatka, walet, dama, krol};
    public enum Suit {trefl  ,karo , kier ,pik};

    private final Value value;
    private final Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return value + "-" + suit;
    }
}

class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Value.As, Card.Suit.kier);
        Card card2 = new Card(Card.Value.siodemka, Card.Suit.pik);
        Card card3 = new Card(Card.Value.krol, Card.Suit.kier);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}