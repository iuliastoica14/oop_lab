import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Numarul este : ");
        int number=input.nextInt();

        if(number>2){
            for(int i=2;i<number;i++)
                for(int j=i;j<=number;j++)
                    if(prim(i) && prim(j) && i+j==number)
                        System.out.println(i+ "+"+j+"="+number);
        }
    }

    public static boolean prim(int number)
    {
        boolean ok = true;
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
