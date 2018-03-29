package BCIT.a00972783.comp1451.Lab5a;

public class Tester {

	public static void main(String[] args) {
		
		Person p = new Person("Jason", "Lee", 1991, false);
		
		p.printDetails();
		System.out.println();
		
		Student s = new Student("Benji", "Studmuffin", 2012, false, "A123", "Bully-ing", 4.0);
		
		s.printDetails();
		System.out.println();
		
		BCITStudent b = new BCITStudent("Benji", "Studmuffin", 2012, false, "A123", "Bully-ing", 4.0, "burnaby");
		
		b.printDetails();
		System.out.println();
		
		
	}
}
