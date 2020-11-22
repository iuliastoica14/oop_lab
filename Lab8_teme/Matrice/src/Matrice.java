public class Matrice {
     private Object[][] matrice=new Object[100][100];
     private int n;

     Matrice(int n)
     {
         this.n=n;
         for(int i=0;i<n;i++)
             for(int j=0;j<n;j++)
                 matrice[i][j]=new Object();
     }

     public Matrice add(Matrice a)
     {
         Matrice rez=new Matrice(n);
         for(int i=0;i<this.n;i++)
             for(int j=0;j<this.n;j++) {
                 if (matrice[i][j] instanceof Complex)
                     rez.matrice[i][j] = ((Complex) matrice[i][j]).adunare(a.matrice[i][j]);
                 else
                     rez.matrice[i][j] = ((Fractie) matrice[i][j]).adunare(a.matrice[i][j]);
             }
         return rez;

     }

    public Matrice minus(Matrice a)
    {
        Matrice rez=new Matrice(n);
        for(int i=0;i<this.n;i++)
            for(int j=0;j<this.n;j++) {
                if (matrice[i][j] instanceof Complex)
                    rez.matrice[i][j] = ((Complex) matrice[i][j]).scadere(a.matrice[i][j]);
                else
                    rez.matrice[i][j] = ((Fractie) matrice[i][j]).scadere(a.matrice[i][j]);
            }
        return rez;
    }

    public Matrice multiply(Matrice a)
    {
        Matrice rez=new Matrice(n);
        for(int i=0;i<this.n;i++)
            for(int j=0,k=0;j<this.n && k<this.n;j++, k++) {
                if (matrice[i][j] instanceof Complex)
                    rez.matrice[i][j]= ((Complex) matrice[i][j]).inmultire(a.matrice[j][i]);
                else
                    rez.matrice[i][j] = ((Fractie) matrice[i][j]).inmultire(a.matrice[j][i]);
            }
        return rez;

    }

    public void setMatrice(int i,int j, Object matrice) {
        this.matrice[i][j] = matrice;
    }

    public void afisare() {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                if( matrice[i][j] instanceof Complex)
                    ((Complex) matrice[i][j]).afiseaza();
                else
                    ((Fractie) matrice[i][j]).afiseaza();
            System.out.println();
        }
    }

}
