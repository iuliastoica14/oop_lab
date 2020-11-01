
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

    public static void main(String[] args) {

        System.out.println("1. Create a string that consists of the first letter of each word in a list of Strings provided.");
        List<String> listStrings = Arrays.asList("Ana","are","mere","blabla");

        listStrings.forEach(str -> System.out.print(str + ' '));
        System.out.println();

        StringBuilder s = new StringBuilder();

        List<String> newList = listStrings.stream()
                .map(str -> String.valueOf(str.charAt(0)))
                .collect(Collectors.toList());

        newList.forEach(temp -> s.append(temp));

        System.out.println(s);

        System.out.println("\n2. Remove the words that have odd lengths from the a list of Strings.");

        List<String> newList2=listStrings.stream()
                .filter(str -> str.length()%2==0)
                .collect(Collectors.toList());

        newList2.forEach(str -> System.out.print(str + ' '));

        System.out.println("\n\n3. Replace every word in a list of Strings with its upper case equivalent.");
        List<String> newList3=listStrings.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        newList3.forEach(str -> System.out.print(str + ' '));

        System.out.println("\n\n5. A list of strings is given. Create a new list with all the strings from original list converted to lower case and print them out.");
        List<String> newList5=listStrings.stream()
                .map(str -> str.toLowerCase())
                .collect(Collectors.toList());
        newList5.forEach(str -> System.out.print(str + ' '));

        System.out.println("\n\n6. Modify exercise 5 so that the new list only contains strings that have an odd length.");
        List<String> newList6=listStrings.stream()
                .filter(str -> str.length()%2!=0)
                .collect(Collectors.toList());
        newList6.forEach(str -> System.out.print(str + ' '));

        System.out.println("\n\n7. Join the second, third and forth strings of the list into a single string, where each word is separated by a hyphen (-).");
        List<String> newList7=listStrings.stream()
                .filter(str -> listStrings.indexOf(str)==1 ||listStrings.indexOf(str)==2||listStrings.indexOf(str)==3)
                .collect(Collectors.toList());
        StringBuilder s7 = new StringBuilder();
        newList7.forEach(temp -> s7.append(temp).append('-'));
        System.out.println(s7);

        System.out.println("\n8. Produce an unbounded list of the powers of two.");
        List<Integer> newList8 = new ArrayList<>();
        Stream.iterate(2, n -> n < 1000000000 , n -> n * 2)
                .forEach(x-> newList8.add(x));
        newList8.toString();

        System.out.println("\n9. How many palindromes are in the list.");
        List<Integer> listIntegers = Arrays.asList(111,23,232,464,554);
        listIntegers.forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println(listIntegers.stream()
                .filter(val-> palindrom(val)!=null)
                .count()+1);

        System.out.println("\n\n10. A list of employees is provided. (An employee has: name (String), age (int) and salary (double)). Compute the average salary of all employees.");
        Employee e1=new Employee("Ana",22,2000.0);
        Employee e2=new Employee("Raluca",19,2800.0);
        Employee e3=new Employee("Vlad",23,3000.0);
        List<Employee> listEmployee = Arrays.asList(e1,e2,e3);

        double sum = listEmployee.stream().mapToDouble(angajat -> angajat.salary).sum();
        System.out.println();
        System.out.println(sum/listEmployee.stream().count());

        System.out.println("\n\n11.");
        List<String> c1= Arrays.asList("mate","info");
        Student s1=new Student("Ana",10.0,c1);
        List<String> c2= Arrays.asList("mate","desen","dans");
        Student s2=new Student("Alin",8.5,c2);
        List<Student> listStudents= Arrays.asList(s1,s2);

        Map<String, Integer> map = new HashMap<>();
        for (Student s11 : listStudents) {
            map.put(s11.name,(int)s11.count());
        }

        System.out.println("\n\n12. Determine the sum of all fibonacci numbers up to a given limit.");
        int fib=Stream.iterate(new int[]{1, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(5)
                .map(n -> n[0])
                .mapToInt(x->x).sum();
        // .forEach(x -> System.out.print(x+" "));
        System.out.println("suma este: "+fib);


    }

    public static Optional<Integer> palindrom(Integer x) {
        Integer y=0;
        Integer m=x;
        while(m>0)
        {
            y=y*10+m%10;
            m/=10;
        }
        if(x.equals(y))return Optional.of(y);
        else return Optional.empty();
    }

    static class Employee {
        String name;
        Integer age;
        Double salary;

        public Employee(String name, Integer age, Double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    static class Student {
        String name;
        double grade;
        List<String> courses;

        public Student(String name, double grade, List<String> courses) {
            this.name = name;
            this.grade=grade;
            this.courses=courses;
        }

        public long count()
        {
            return courses.stream().count();
        }
    }
}
