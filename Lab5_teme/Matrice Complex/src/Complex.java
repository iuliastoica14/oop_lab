public class Complex {
    public int re, im;

    public Complex() {
        this.re=0;
        this.im=0;
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex afiseaza() {
        System.out.print(this.re);
        if (this.im<0) System.out.print(this.im+"i");
        else System.out.print("+"+this.im+"i");
        System.out.print(" ");
        return this;
    }

    public Complex add(Complex b){
        Complex c=new Complex();
        c.re=this.re+b.re;
        c.im=this.im+b.im;
        return c;
    }

    public Complex minus(Complex b){
        Complex c=new Complex();
        c.re=this.re-b.re;
        c.im=this.im-b.im;
        return c;
    }

    public Complex ori(Complex b){
        Complex c=new Complex();
        c.re=this.re*b.re-this.im*b.im;
        c.im=this.im*b.re+this.re*b.im;
        return c;
    }
    public  Complex orin(int n){
        Complex c=new Complex();
        c.re=this.re*n;
        c.im=this.im*n;
        return c;
    }
}
