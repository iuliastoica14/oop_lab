/**
 * Main class of the Java application. 
 * It contains the main method that starts the Java application.
 */
public class MainClass {

	/**
	 * The main method.
	 */
	public static void main(String[] args) {
		Student s1 = new Student("Ana",1998,"UTCN20424");
		Student s2 = new Student();
		Staff x = new Staff("Vasile",1990,"209");
		
		System.out.println(s2.getName());
		
		s2.setName("Andreea");
		s2.setYearOfBirth(1997);
		
		Database d = new Database();
		d.addPerson(s1);
		d.addPerson(s2);
		d.addPerson(x);
		d.listAll();
	}

}
