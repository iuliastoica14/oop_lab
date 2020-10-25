import java.util.Scanner;

public class Loto {
    public static void main(String[] nt)
    {
        double lottery=1;
        for(int i=1;i<=6;i++)
        {
            lottery=lottery*(49-i+1)/i;     //combination
        }
        lottery=1/lottery;
        System.out.println("Sanse "+lottery);
    }
}
