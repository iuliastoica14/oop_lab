package multipleImplementation;

public class BaseClassImplementation implements Interface1, Interface2 {

    public void show() {
        Interface1.super.show();
        Interface2.super.show();
    }

    public static void main(String args[]) {
        BaseClassImplementation baseObject = new BaseClassImplementation();
        baseObject.show();
    }
}
