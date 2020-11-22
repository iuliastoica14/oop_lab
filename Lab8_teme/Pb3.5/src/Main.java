public class Main {

    public static void main(String[] args){
        Masina m=new Masina("Audi","negru");
        Student s=new Student("Stoica","Iulia",m);

        Student shallowcopy=new Student(s.getNume(),s.getPrenume(),s.getM());
        try {
            System.out.println("Deepcopy:\n");
            Student deepcopy = (Student) s.clone();
            m.revopsire("rosu");
            System.out.println(s);
            System.out.println(deepcopy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("Shallowcopy:\n");
        System.out.println(s);
        System.out.println(shallowcopy);

    }
}
