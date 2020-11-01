
    public class Matrice {
        public Complex[][] mat=new Complex[100][100];
        public int m,mn;

        public Matrice(int x,int y) {
            m=x;
            mn=y;
            int i,j;
            for(i=0;i<m;i++)
                for(j=0;j<mn;j++)
                    mat[i][j]=new Complex();
        }
        public void afisare() {
            int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<mn;j++)
                    mat[i][j].afiseaza();
                System.out.println();
            }
        }

        public void adunare(Matrice n){
            if(m!=n.m || mn!=n.mn){
                System.out.println("matle nu se pot aduna!");
                return;
            }
            int i,j;
            for(i=0;i<this.m;i++)
                for(j=0;j<this.mn;j++)
                    mat[i][j]=mat[i][j].add(n.mat[i][j]);

        }

        public void scadere(Matrice n){
            if(m!=n.m || mn!=n.mn){
                System.out.println("matle nu se pot scadea!");
                return;
            }
            int i,j;
            for(i=0;i<m;i++)
                for(j=0;j<mn;j++)
                    mat[i][j]=mat[i][j].minus(n.mat[i][j]);
        }
        public void inmultire(Matrice n){
            if(this.mn!=n.m) System.out.println("matle nu pot fi inmultite!");
            else
            {
                Matrice c=new Matrice(m,n.mn);
                int i,j,k;
                for(i=0;i<m;i++)
                    for(j=0;j<n.mn;j++)
                        for(k=0;k<mn;k++)
                        {
                            Complex a=new Complex();
                            Complex b=new Complex();
                            a=mat[i][k];
                            b=n.mat[k][j];
                            a.ori(b);
                            c.mat[i][j]=c.mat[i][j].add(a);
                        }
                m=c.m;
                mn=c.mn;
                for(i=0;i<m;i++)
                    for(j=0;j<mn;j++)
                        mat[i][j]=c.mat[i][j];
            }
        }
        public void inmultire(int x){
            int i,j;
            for(i=0;i<m;i++)
                for(j=0;j<mn;j++)
                    mat[i][j]=mat[i][j].orin(x);
        }

        public void impartire(int x) {
            int i,j;
            for(i=0;i<m;i++)
                for(j=0;j<mn;j++)
                {
                    mat[i][j].re/=x;
                    mat[i][j].im/=x;
                }
        }
}
