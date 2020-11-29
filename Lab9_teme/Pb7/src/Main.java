public class Main {

    public static void main(String[] args) {
	    C c=new C();
	    A upcast=(A)c;
	    A a=new A();
	    B b=new B();
	    a.v[0]=1;
	    a.v[1]=2;
	    a.v[2]=3;
	    b.d=0;
        try {
	        upcast.f(2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
