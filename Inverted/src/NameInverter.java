
import java.util.Scanner;

public class NameInverter {

    public static void main(String[] args){
//        Scanner in= new Scanner(System.in);
//        String s = in.nextLine();
//
//        System.out.println("Name: "+nameInv(s));
    }

    public static String nameInv(String s)
    {
        s=s.trim();
        if(s==null && s.isEmpty())
            return null;
        else {
            String[] aux = s.split(" ");
            String ok = null;
            if (aux.length == 1)
                ok = aux[0];
            else if (aux.length > 2) {
                ok = aux[aux.length - 1] + ", " + aux[aux.length - 2] + " ";
                for (int i = 0; i < aux.length - 3; i++)
                    ok += aux[i] + " ";
                ok += aux[aux.length - 3];
            } else
                ok = aux[1] + ", " + aux[0];
            return ok;
        }
    }

}
