import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Card> deck=new ArrayList<Card>();
        deck.add(new Card("2","hearts"));
        deck.add(new Card("3","spades"));
        deck.add(new Card("4","diamonds"));
        deck.add(new Card("5","clubs"));
        deck.add(new Card("6","clubs"));
        deck.add(new Card("7","hearts"));
        deck.add(new Card("8","clubs"));
        deck.add(new Card("9","spades"));
        deck.add(new Card("J","diamonds"));
        deck.add(new Card("Q","spades"));
        deck.add(new Card("K","diamonds"));
        deck.add(new Card("A","clubs"));

        Card toadd=new Card("9","spades");
        Card toadd2=new Card("9","hearts");

        ClassIterator it=new ClassIterator(deck);

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        it.remove();
        it.afisare();
        System.out.println(it.put(toadd));
        System.out.println(it.put(toadd2));
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
