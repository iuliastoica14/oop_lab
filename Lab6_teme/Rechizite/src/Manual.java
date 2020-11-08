public class Manual extends Rechizita {
    private String eticheta;

    public Manual(String eticheta){
        this.eticheta=eticheta;;
    }

    public String getNume(){
        return "Manual "+ eticheta ;
    }
}
