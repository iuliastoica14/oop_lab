public class Student implements Cloneable{
    private String nume,prenume;
    private Masina m;

    Student(String nume, String prenume, Masina m){
        this.nume=nume;
        this.prenume=prenume;
        this.m=m;
    }

    public Object clone() throws CloneNotSupportedException {
        Student clonedStudent=(Student) super.clone();
        clonedStudent.m=(Masina) clonedStudent.getM().clone();
        return clonedStudent;
    }

    public Masina getM() {
        return m;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String toString()
    {
        return "Studentul: "+nume+ " "+prenume+"\n"+m;
    }
}
