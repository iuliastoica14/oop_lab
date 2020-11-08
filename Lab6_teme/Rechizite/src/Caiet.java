public class Caiet extends Rechizita {
    private String eticheta;

    public Caiet(String eticheta){
        this.eticheta=eticheta;
    }

    public String getNume(){
        return "Caiet " + eticheta;
    }
}
