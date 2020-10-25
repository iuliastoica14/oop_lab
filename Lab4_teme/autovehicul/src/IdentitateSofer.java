public class IdentitateSofer {
    private String CNP;
    private String seria;
    private int numar;

    IdentitateSofer()
    {
        CNP=null;
        seria=null;
        numar=0;
    }

    IdentitateSofer( String CNP, String seria, int numar ){
        this.CNP=CNP;
        this.seria=seria;
        this.numar=numar;
    }

    public String toString() {
        return "ID: " + CNP + ", " + seria + ", " + numar;
    }
}
