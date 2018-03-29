package BCIT.a00972783.comp1451.Lab5a;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private boolean isFemale;
	
	public Person (String firstName, String lastName, int birthYear, boolean isFemale)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
		setFemale(isFemale);
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName != null & firstName.length() > 0) 
		{
			this.firstName = firstName;
		}
		else
		{
			System.err.println("Not a valid input for name, try again");
		}
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName != null & lastName.length() > 0) 
		{
			this.lastName = lastName;
		}
		else
		{
			System.err.println("Not a valid input for name, try again");
		}
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		if(birthYear > 0) 
		{
			this.birthYear = birthYear;
		}
		else
		{
			System.err.println("Not a valid input for year, try again");
		}
	}
	
	public boolean isFemale() {
		return isFemale;
	}
	
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	
	public void printDetails() {
		
		if(isFemale == true) {
		System.out.println( firstName + " " + lastName + " is a " + getClass().getSimpleName() + ". She was born in " + birthYear + ". ");
		}
		
		else {
		System.out.println( firstName + " " + lastName + " is a " + getClass().getSimpleName() + ". He was born in " + birthYear + ". ");
		}
	}
	
	
		
}
