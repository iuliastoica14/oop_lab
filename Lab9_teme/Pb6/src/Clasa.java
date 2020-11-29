public class Clasa {

    public void g(int i) throws Exception1{
        if(i<=0)
            throw new Exception1("Numarul trebuie sa fie mai mare ca 0!");
    }

    public void f(int i) throws Exception2{
        try{
            g(i);
        }catch (Exception1 e){
            System.out.println(e.getMessage());
            throw new Exception2("Numar introdus gresit!");
        }
    }

}
