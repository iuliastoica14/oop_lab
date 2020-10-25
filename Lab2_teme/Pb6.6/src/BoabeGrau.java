import java.math.BigInteger;
import java.lang.Math;

public class BoabeGrau {

    public static void main(String[] args) {
        System.out.println("\nTotal boabe: "+ totalBoabe());
    }

    public static BigInteger totalBoabe()
    {
        BigInteger x= new BigInteger("1");
        BigInteger s= new BigInteger("2");
        for(int i=0;i<64;i++)
            x=x.multiply(s);
        return x;
    }

}


