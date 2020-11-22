import java.util.Arrays;

public class Card implements Comparable<Card>{
    private String suit;
    private String number;

    public Card(String number,String suit) {
        this.number = number;
        this.suit=suit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Card c) {
        int compare= this.number.compareTo(c.number);
        return compare==0 ? this.suit.compareTo(c.suit) : compare;
    }

    @Override
    public String toString() {
        return "Card : "+number+" "+suit;
    }
}
