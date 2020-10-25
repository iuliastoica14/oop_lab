public class Autovehicul {
    private String marca;
    private final String culoare="negru";
    private double viteza;
    private int treapta_viteza;
    private double viteza_max;
    private Sofer s;
    private Motor m;

    Autovehicul(){
        marca=null;
        viteza=0;
        treapta_viteza=0;
        viteza_max=0;
        s=new Sofer();
        m=new Motor();
    };

    Autovehicul(String marca,double viteza,int treapta_viteza, double viteza_max)
    {
        this.marca=marca;
        this.viteza=viteza;
        this.treapta_viteza=treapta_viteza;
        this.viteza_max=viteza_max;
    }

    void accelerare(double viteza)
    {
        if((this.viteza+viteza)<=viteza_max)
            this.viteza+=viteza;
    }

    void accelerare(int viteza)
    {
        if((this.viteza+viteza)<=viteza_max)
            this.viteza+=viteza;
    }

    void deaccelerare(double viteza)
    {
        if((this.viteza-viteza)>=0)
            this.viteza-=viteza;
    }

    void schimbareTreapta(int treapta_viteza)
    {
        this.treapta_viteza=treapta_viteza;
    }

    void oprire()
    {
        viteza=0;
    }

    public double getViteza() {
        return viteza;
    }

    public void setViteza(double viteza) {
        this.viteza = viteza;
    }

    public void setTreapta_viteza(int treapta_viteza) {
        this.treapta_viteza = treapta_viteza;
    }

    public void setViteza_max(double viteza_max) {
        this.viteza_max = viteza_max;
    }

    public void setS(Sofer s) {
        this.s = s;
    }

    public String toString() {
        return marca + ", " + culoare + ", " + viteza + ", " + treapta_viteza + ", " + viteza_max + '\n'+s+'\n'+m+'\n';
    }

    public Motor getM() {
        return m;
    }

    public void setM(Motor m) {
        this.m = m;
    }
}
