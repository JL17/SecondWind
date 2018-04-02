package BCIT.a00972783.comp1451.Lab5a;

import java.util.HashMap;
import java.util.Map.Entry;

public class School {
	
	private Person president;
	private HashMap<String, Person> school;
	
	public School()
	{
		president = new Person("Kathy", "Kinloch", 1960, true);
		school = new HashMap<String, Person>();
		
		Student s1 = new Student("Gloria", "Macarenko", 1962, true, "A88877777", "Journalism", 2.9);
		Student s2 = new Student("Markus", "Frind", 1979, false, "A12345678", "Computer Science", 3.1);
		
		addPerson(s1.getStudentNumber(), s1);
		addPerson(s2.getStudentNumber(), s2);
		addPerson(null, president);
		
		for(Entry<String, Person> pair: school.entrySet()) {
			pair.getValue().printDetails();
		}
		
	}
	
	public void addPerson(String studentNumber, Person person)
	{
		school.put(studentNumber, person);
	}

}
