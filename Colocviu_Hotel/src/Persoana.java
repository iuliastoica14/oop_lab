abstract class Persoana {
    private int ID;
    private String nume;
    private String numar_telefon;

    Persoana(int ID, String nume, String numar_telefon)
    {
        this.ID=ID;
        this.nume=nume;
        this.numar_telefon=numar_telefon;
    }

    public String toString()
    {
        return "ID:"+ID+"\nNume: "+nume+"\nNr. Telefon: "+numar_telefon+'\n';
    }
}
