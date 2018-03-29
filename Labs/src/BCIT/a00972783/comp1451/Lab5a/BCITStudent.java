package BCIT.a00972783.comp1451.Lab5a;

public class BCITStudent extends Student {

	private String campus;
	
	public BCITStudent(String firstName, String lastName, int birthYear, boolean isFemale, String studentNumber,
			String major, double gpa, String campus) {
		super(firstName, lastName, birthYear, isFemale, studentNumber, major, gpa);
		setCampus(campus);
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		if(campus.equalsIgnoreCase("Burnaby") || campus.equalsIgnoreCase("Downtown") || campus.equalsIgnoreCase("Richmond") || campus.equalsIgnoreCase("North Vancouver") )
		{
			String firstInitial = campus.substring(0, 1).toUpperCase();
			String theRest = campus.substring(1);
			campus = firstInitial + theRest;
			this.campus = campus;
		}
		else
		{
			System.out.println("Not a valid campus.");
		}
	}	
	
	public void printDetails() {
		
		if(isFemale()) {
			System.out.println(getFirstName() + " " + getLastName() + " is a " + getClass().getSimpleName() + " of " + getMajor() + ". " + "Student#: " + getStudentNumber() + " at the " + getCampus() + " campus. She was born in " + getBirthYear() + ". " );
		}
		
		else {
			System.out.println(getFirstName() + " " + getLastName() + " is a " + getClass().getSimpleName() + " of " + getMajor() + ". " + "Student#: " + getStudentNumber() + " at the " + getCampus() + " campus. He was born in " + getBirthYear() + ". " );
		}
		
	}
	
	
	
}
