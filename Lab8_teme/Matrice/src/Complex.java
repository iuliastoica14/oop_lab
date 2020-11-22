
public class Complex implements Numeric {
        private double re;
        private double im;

        public Complex(double re, double im) {
            this.re = re;
            this.im = im;
        }
        public Complex(){ this(0,0);}

        public Complex afiseaza() {
            System.out.print(this.re);
            if (this.im<0) System.out.print(this.im+"i");
            else System.out.print("+"+this.im+"i");
            System.out.print("\t");
            return this;
        }

        public double getRe(){return re;}
        public void setRe(double re){this.re=re;}
        public double getIm(){return im;}
        public void setIm(double im){this.im=im;}

        public Object adunare(Object b){
            Complex c=new Complex();
            if(b instanceof Complex) {
                c.re = this.re + ((Complex) b).getRe();
                c.im = this.im + ((Complex) b).getIm();
            }
            else {
                c.re = this.re +((Fractie) b).getReal();
                c.im = this.im ;
            }
            return c;
        }

        public Object scadere(Object b){
            Complex c=new Complex();
            if(b instanceof Complex) {
                c.re = this.re - ((Complex) b).getRe();
                c.im = this.im - ((Complex) b).getIm();
            }
            else {
                c.re = this.re - ((Fractie) b).getReal();
                c.im = this.im ;
            }
            return c;
        }

        public Object inmultire(Object b){
            Complex c=new Complex();
            if(b instanceof Complex) {
                c.re = this.re * ((Complex) b).getRe();
                c.im = this.im * ((Complex) b).getIm();
            }
            else {
                c.re = this.re * ((Fractie) b).getReal();
                c.im = this.im ;
            }
            return c;
        }

}
