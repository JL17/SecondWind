package bcit.a00972783.comp1451.lab6a;

public class Bishop extends Piece {

	public Bishop(boolean isWhite, int value) {
		super(isWhite, value);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return color() + " " + getClass().getSimpleName() + "(" + getValue() + ")";
	}

	@Override
	public void move() {
		System.out.println("diagonally");
	}
}
