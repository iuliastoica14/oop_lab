package serializable;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialversionUID = 129348938L;

    transient String cnp;
    static int value;
    String name;
    int age;

    public Student(String name, int age, String cnp, int b) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.value = b;
    }

    public String toString() {
        return "name = " + name + "\n" +
                "age = " + age + "\n" +
                "a = " + cnp + "\n" +
                "b = " + value;
    }

}
