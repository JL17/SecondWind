package bcit.a00972783.comp1451.lab6a;

public class ChessPiece {
	private boolean isWhite;
	private int value;
	
	public ChessPiece (boolean isWhite, int value)
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
	
	
	
	
}
