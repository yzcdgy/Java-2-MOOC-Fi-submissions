
public class Main {

    public static void main(String[] args) {
        // test your code here

        Hand hand1 = new Hand();
        hand1.add(new Card(12, Suit.HEART));
        Hand hand2 = new Hand();
        hand2.add(new Card(3, Suit.SPADE));
        hand2.add(new Card(9, Suit.SPADE));
        hand2.compareTo(hand1);
    }
}
