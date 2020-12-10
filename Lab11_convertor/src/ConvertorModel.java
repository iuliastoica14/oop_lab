public class ConvertorModel {

    static final double INITIAL_VALUE = 1;
    double suma;
    double rezultat;

    public void convert(String valuta1,String valuta2){
        if(valuta1.equals("EUR")) {
            if (valuta2.equals("RON")) {
                rezultat = suma * 4.87;
            } else if (valuta2.equals("USD")) {
                rezultat = suma * 1.21;
            } else
                rezultat = suma;
        }
        if(valuta1.equals("RON")) {
            if (valuta2.equals("EUR")) {
                rezultat = suma * 0.21;
            } else if (valuta2.equals("USD")) {
                rezultat = suma * 0.24;
            } else
                rezultat = suma;
        }
        if(valuta1.equals("USD")) {
            if (valuta2.equals("RON")) {
                rezultat = suma * 4.02;
            } else if (valuta2.equals("EUR")) {
                rezultat = suma * 0.83;
            } else
                rezultat = suma;
        }
    }

    public double getRezultat(){return rezultat;}
}
