
import java.util.ArrayList;
import java.util.List;

public class ClassIterator  implements OrderedIterator {
    private List<Card> deck= new ArrayList<Card>();
    private int size = 13;
    private int iterator = 0;

    public ClassIterator(List<Card> deck) {
        this.deck = deck;
    }

    public void afisare()
    {
        Card c=deck.get(iterator);
        System.out.println(c.toString());
    }
    @Override
    public boolean hasNext() {
        return (iterator < size-2);
    }


    @Override
    public Object next() {
        if(hasNext()){
            return deck.get(iterator++);
        }
        iterator=0;
        return null;
    }

    @Override
    public void remove(){
        deck.remove(iterator);
        size--;
    }



    @Override
    public int put(Comparable c) {
       for(Card i:deck)
           if(c.compareTo(i)==0)
               return 0;
       deck.add((Card)c);
       size++;
       return 1;
    }
}
