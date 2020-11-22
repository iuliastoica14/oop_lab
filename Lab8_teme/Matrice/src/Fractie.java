public class Fractie implements Numeric{
    private double x,y;

    Fractie(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getReal()
    {
        return x/y;
    }


    public Object adunare(Object b){
        if(b instanceof Complex) {
            double re=this.getReal()+((Complex) b).getRe();
            double im=((Complex) b).getIm();
            Complex c=new Complex(re,im);
            return c;
        }
        else {
            double x = this.x * ((Fractie) b).getY() + ((Fractie) b).getX() * this.y;
            double y = this.y * ((Fractie) b).getY();
            Fractie c = new Fractie(x, y);
            return c;
        }
    }

    public Object scadere(Object b){
        if(b instanceof Complex) {
            double re=this.getReal()-((Complex) b).getRe();
            double im=-((Complex) b).getIm();
            Complex c=new Complex(re,im);
            return c;
        }
        else {
            double x = this.x * ((Fractie) b).getY() - ((Fractie) b).getX() * this.y;
            double y = this.y * ((Fractie) b).getY();
            Fractie c = new Fractie(x, y);
            return c;
        }
    }

    public Object inmultire(Object b){
        if(b instanceof Complex) {
            double re=this.getReal()*((Complex) b).getRe();
            double im=-((Complex) b).getIm();
            Complex c=new Complex(re,im);
            return c;
        }
        else {
            double x = this.x * ((Fractie) b).getX() ;
            double y = this.y * ((Fractie) b).getY();
            Fractie c = new Fractie(x, y);
            return c;
        }
    }


    public Fractie afiseaza()
    {
        System.out.print(this.x+"/"+this.y+"\t");
        return this;
    }

}
