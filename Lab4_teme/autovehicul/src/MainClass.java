public class MainClass {
    public static void main(String[] args){
        Autovehicul v =new Autovehicul("Audi",100,3,300);
        Autovehicul b =new Autovehicul();
        Sofer s=new Sofer("Ana","Ionescu",20,2);
        Motor m=new Motor(3300,211,"Automata");
        IdentitateSofer id=new IdentitateSofer("048573947","CJ", 854753);

        v.setS(s);
        v.setM(m);
        s.setId(id);

        b.setViteza(50);
        b.setTreapta_viteza(2);
        b.setViteza_max(200);
        System.out.println(b);

        v.accelerare(100);
        v.schimbareTreapta(4);
        v.deaccelerare(20);
        System.out.println(v);

        double a=v.getViteza();

        v.accelerare(102.22);
        System.out.println(v);

        double a2=v.getViteza();

        System.out.println("Prima functie: "+a+"\nFunctia Suprascrisa: "+a2);
        System.out.println("\n");

        v.oprire();
        v.schimbareTreapta(1);
        System.out.println(v);

    }
}
