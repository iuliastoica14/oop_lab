public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private int age;

    Student(String first, String last, int age) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
    }

    @Override
    public int compareTo(Student author) {
        int last = this.lastName.compareTo(author.lastName);
        return last == 0 ? this.firstName.compareTo(author.firstName) : last;
    }

    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName + " " +
                this.age + "\n";
    }
}
