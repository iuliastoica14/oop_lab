import java.util.Date;

public class Angajat  extends Persoana implements Comparable<Angajat>{
    private String angajare;
    private String clienti_serviti;

    Angajat(int ID, String nume, String numar_telefon,String angajare,String clienti_serviti)
    {
        super(ID,nume,numar_telefon);
        this.angajare=angajare;
        this.clienti_serviti=clienti_serviti;
    }

    @Override
    public int compareTo(Angajat a)
    {
        return this.clienti_serviti.compareTo(a.clienti_serviti);
    }

    public String toString(){
        return super.toString()+"Angajare: "+angajare+"\n Clienti servici: "+clienti_serviti+'\n';
    }
}
