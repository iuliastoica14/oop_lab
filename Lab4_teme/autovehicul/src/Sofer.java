public class Sofer {
    private String nume;
    private String prenume;
    private int varsta;
    private int permis;
    private IdentitateSofer id;

    Sofer()
    {
        this.nume=null;
        this.prenume=null;
        this.varsta=0;
        this.permis=0;
        id= new IdentitateSofer();
    }

    Sofer(String nume, String prenume, int varsta, int permis){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.permis=permis;
    }

    public String toString() {
        return "Sofer: " + nume + ", " +prenume + ", " + varsta + ", " + permis +"\n"+id;
    }

    public void setId(IdentitateSofer id) {
        this.id = id;
    }
}
