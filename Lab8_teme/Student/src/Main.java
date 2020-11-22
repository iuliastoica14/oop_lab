import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student("Ana","Popescu",20));
        studentList.add(new Student("Maria","Popescu",20));
        studentList.add(new Student("Iulia","Stoica",20));
        studentList.add(new Student("Mara","Patac",20));

        Collections.sort(studentList);

        for(Student i:studentList)
            System.out.println(i);
    }
}
