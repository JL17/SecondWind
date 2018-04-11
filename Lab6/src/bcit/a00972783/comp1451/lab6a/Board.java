package bcit.a00972783.comp1451.lab6a;

public class Board {

	Piece[][] board;
	
	
	public Board() {
		board = new Piece[8][8];
		initializeBoard();
	}
	
	public void initializeBoard() {
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		
	board[0][1] = new Pawn(false, 1);
	board[1][1] = new Pawn(false, 1);
	board[2][1] = new Pawn(false, 1);
	board[3][1] = new Pawn(false, 1);
	board[4][1] = new Pawn(false, 1);
	board[5][1] = new Pawn(false, 1);
	board[6][1] = new Pawn(false, 1);
	board[7][1] = new Pawn(false, 1);
	
	board[0][0] = new Rook(false, 5);
	board[1][0] = new Knight(false, 3);
	board[2][0] = new Bishop(false, 3);
	board[3][0] = new Queen(false, 9);
	board[4][0] = new King(false, 100);
	board[5][0] = new Bishop(false, 3);
	board[6][0] = new Knight(false, 3);
	board[7][0] = new Rook(false, 5);
	
	//black
	board[0][6] = new Pawn(true, 1);
	board[1][6] = new Pawn(true, 1);
	board[2][6] = new Pawn(true, 1);
	board[3][6] = new Pawn(true, 1);
	board[4][6] = new Pawn(true, 1);
	board[5][6] = new Pawn(true, 1);
	board[6][6] = new Pawn(true, 1);
	board[7][6] = new Pawn(true, 1);
	
	board[0][7] = new Rook(true, 5);
	board[1][7] = new Knight(true, 3);
	board[2][7] = new Bishop(true, 3);
	board[3][7] = new Queen(true, 9);
	board[4][7] = new King(true, 100);
	board[5][7] = new Bishop(true, 3);
	board[6][7] = new Knight(true, 3);
	board[7][7] = new Rook(true, 5);
	}
	
	
}
