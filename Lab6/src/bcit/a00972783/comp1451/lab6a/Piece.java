package bcit.a00972783.comp1451.lab6a;

public class Piece {
	private boolean isWhite;
	private int value;
	
	public Piece (boolean isWhite, int value)
	{
		setValue(value);
		setWhite(isWhite);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isWhite() {
		return isWhite;
	}
	
	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	public void move() {
		System.out.println("moving...");
	}
	
	public String color() {
		if(isWhite == true)
		{
			return "White";
		}
		else
		{
			return "Black";
		}
	}
		
	@Override
	public String toString() {
		return color() + " " + getClass().getSimpleName();
	}
	
	
}
