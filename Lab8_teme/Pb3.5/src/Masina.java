public class Masina implements Cloneable {
    private String marca, culoare;

    Masina(String marca, String culoare)
    {
        this.marca=marca;
        this.culoare=culoare;
    }

    public void revopsire(String culoare)
    {
        this.culoare=culoare;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString()
    {
        return "Masina: "+marca+" "+culoare+"\n";
    }
}
