import java.util.ArrayList;
import java.util.List;

public class Ghiozdan {
    private ArrayList<Rechizita> listaRechizite=new ArrayList<Rechizita>();

    public void add(Caiet c)
    {
        listaRechizite.add(c);
    }

    public void add(Manual c)
    {
        listaRechizite.add(c);
    }

    public void listItems()
    {
        System.out.println("Listare rechizite: ");
        for(Rechizita i:listaRechizite)
            System.out.println(i.getNume());
        System.out.println();
    }

    public void listManual() {
        System.out.println("Listare manuale: ");
        for (Rechizita i : listaRechizite) {
            if (i instanceof Manual)
                System.out.println(i.getNume());
        }
        System.out.println();
    }

    public void listCaiet() {
        System.out.println("Listare caiete: ");
        for (Rechizita i : listaRechizite) {
            if(i  instanceof Caiet)
                System.out.println(i.getNume());
        }
        System.out.println();
    }

    public int getNrRechizite()
    {
        int ct=0;
        for(Rechizita i:listaRechizite)
                ct++;
        return  ct;
    }

    public int getNrManuale()
    {
        int ct=0;
        for(Rechizita i:listaRechizite)
            if(i instanceof Manual)
                ct++;
        return  ct;
    }

    public int getNrCaiete()
    {
        int ct=0;
        for(Rechizita i:listaRechizite)
            if(i instanceof Caiet)
                ct++;
        return  ct;
    }
}
