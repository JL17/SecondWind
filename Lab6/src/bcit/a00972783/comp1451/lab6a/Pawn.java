package bcit.a00972783.comp1451.lab6a;

public class Pawn extends Piece {
	
	public boolean hasBeenPromoted;

	public Piece newPiece;

	public Pawn(boolean isWhite, int value) {
		super(isWhite, value);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isHasBeenPromoted() {
		return hasBeenPromoted;
	}

	public void setHasBeenPromoted(boolean hasBeenPromoted) {
		this.hasBeenPromoted = hasBeenPromoted;
	}

	@Override
	public String toString() {
		return color() + " " + getClass().getSimpleName() + "(" + getValue() + ")";
	}
	
	@Override
	public void move() {
		System.out.println("Forward 1");
	}
	
	public static void promote(Piece piece) {
		if()
	}
	
	@Override
	public boolean equals(Object piece) {
		if (this.isHasBeenPromoted() == true) {
			return false;
		}
		else {
			return true;
		}
	}
}
