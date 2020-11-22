public class Main {
    public static void main(String[] args) {
        Matrice m1=new Matrice(2);
        Matrice m2=new Matrice(2);

        m1.setMatrice(0,0,new Complex(1,1));
        m1.setMatrice(0,1,new Fractie(1,1));
        m1.setMatrice(1,0,new Complex(2,0));
        m1.setMatrice(1,1,new Complex(2,1));

        m2.setMatrice(0,0,new Complex(1,1));
        m2.setMatrice(0,1,new Fractie(4,2));
        m2.setMatrice(1,0,new Fractie(5,2));
        m2.setMatrice(1,1,new Fractie(1,2));

        m1.afisare();
        System.out.println();
        m2.afisare();

        Matrice rez=m1.add(m2);
        System.out.println();
        rez.afisare();

        rez=m1.minus(m2);
        System.out.println();
        rez.afisare();

        rez=m1.multiply(m2);
        System.out.println();
        rez.afisare();

    }
}
