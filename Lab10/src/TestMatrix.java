public class TestMatrix {
    public static void main(String[] args) {


        Double[][] d1=new Double[][]{{1.01,2.02,3.5},{5.4,4.4,6.1},{0.0,0.0,0.0}};
        Double[][] d2=new Double[][]{{1.99,2.98,1.3},{5.6,6.6,4.9},{1.0,2.0,2.0}};

        DoubleMatrix doubleMatrix=new DoubleMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(d1, d2, doubleMatrix.addMatrix(d1, d2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(d1, d2, doubleMatrix.multiplyMatrix(d1, d2), '*');

        System.out.println();
        Long[][] l1= new Long[][]{{100L,55L},{Long.MAX_VALUE-1000,Long.MIN_VALUE+5}};
        Long[][] l2= new Long[][]{{20L,5L},{0L,Long.MIN_VALUE}};

        LongMatrix longMatrix=new LongMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(l1,l2,longMatrix.addMatrix(l1,l2),'+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(l1,l2,longMatrix.multiplyMatrix(l1,l2),'+');
    }
}