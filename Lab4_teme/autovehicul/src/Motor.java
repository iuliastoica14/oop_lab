public class Motor {
    private int capacitate;
    private int putere;
    private String cutie_viteza;

    Motor(){
        capacitate=0;
        putere=0;
        cutie_viteza=null;
    }

    Motor(int capacitate, int putere, String cutie_viteza){
        this.capacitate=capacitate;
        this.putere=putere;
        this.cutie_viteza=cutie_viteza;
    }

    public String toString() {
        return "Motor: " + capacitate + ", " + putere + ", " + cutie_viteza;
    }
}
