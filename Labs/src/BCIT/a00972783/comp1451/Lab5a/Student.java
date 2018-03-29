package BCIT.a00972783.comp1451.Lab5a;

public class Student extends Person {

	private String studentNumber;
	private String major;
	private double gpa;
	
	public Student(String firstName, String lastName, int birthYear, boolean isFemale, String studentNumber, String major, double gpa) {
		super(firstName, lastName, birthYear, isFemale);
		setGpa(gpa);
		setMajor(major);
		setStudentNumber(studentNumber);
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		if(studentNumber.substring(0, 1).equalsIgnoreCase("A"))
		{
		this.studentNumber = studentNumber;
		}
		else
		{
			System.err.println("Invalid input for Student#. Must start with an 'A' ");
		}
	}

	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void printDetails() {
		
		if(isFemale()) {
			System.out.println(getFirstName() + " " + getLastName() + " is a " + getClass().getSimpleName() + " of " + getMajor() + ". " + "Student#: " + getStudentNumber() + ". She was born in " + getBirthYear() + ". " );
		}
		
		else {
			System.out.println(getFirstName() + " " + getLastName() + " is a " + getClass().getSimpleName() + " of " + getMajor() + ". " + "Student#: " + getStudentNumber() + ". He was born in " + getBirthYear() + ". " );
		}
	}

}
