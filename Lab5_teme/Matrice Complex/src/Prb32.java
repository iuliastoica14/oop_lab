public class Prb32 {
    public static void main(String[] args) {
        Matrice mat1 = new Matrice(3, 3);
        Matrice mat2 = new Matrice(3, 3);

        Complex z1 = new Complex(1, 0);
        Complex z2 = new Complex(0, 1);

        for (int i = 0; i < mat1.m; i++)
            for (int j = 0; j < mat1.mn; j++)
                mat1.mat[i][j] = z1;

        for (int i = 0; i < mat2.m; i++)
            for (int j = 0; j < mat2.mn; j++)
                mat2.mat[i][j] = z2;

        System.out.println("Matricea m:");
        mat1.afisare();
        System.out.println();
        System.out.println("Matricea n:");
        mat2.afisare();
        System.out.println();
        System.out.println("Adunare: ");
        mat1.adunare(mat2);
        mat1.afisare();
        System.out.println();
        System.out.println("Scadere:");
        mat1.scadere(mat2);
        mat1.afisare();
        System.out.println();
        System.out.println("Inmultire :");
        mat1.inmultire(mat2);
        mat1.afisare();
        System.out.println();
        System.out.println("Inmultire cu 2:");
        mat1.inmultire(2);
        mat1.afisare();
        System.out.println();
        System.out.println("Impartire cu 6:");
        mat1.impartire(6);
        mat1.afisare();
    }
}
