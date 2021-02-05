package cloning;

public class Employee implements Cloneable {

    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
