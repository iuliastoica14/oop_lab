public class Main {

    public static void main(String[] args) {
	    Clasa obiect=new Clasa();
	    obiect.a=5;
        obiect.plus(2);
        System.out.println(obiect.a);
	    obiect.minus(1);
        System.out.println(obiect.a);
        obiect.ori();
        System.out.println(obiect.a);

        Interface1 f=new Interface1() {
            @Override
            public void plus(int a) {
                obiect.a=a+1;
            }

            @Override
            public void minus(int a) {
                obiect.a=a-1;
            }
        };

        obiect.metoda1(f);
        System.out.println(obiect.a);
    }
}
