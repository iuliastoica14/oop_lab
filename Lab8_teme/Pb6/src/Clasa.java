public class Clasa  extends MostenireClasa implements MostenireInterfata {
    int a;
    @Override
    public void plus(int b) {
        a=a+b;
    }

    @Override
    public void minus(int b) {
        a=a-b;
    }

    @Override
    public void ori() {
        a=a*2;
    }

    public void metoda1(Interface1 f){
        f.plus(2);
        f.minus(3);
    }
    public void metoda2(Interface2 f){

    }
    public void metoda3(Interface3 f){

    }
    public void metoda4(MostenireInterfata f){

    }
}
