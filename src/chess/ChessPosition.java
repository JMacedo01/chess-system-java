package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
>>>>>>> 7b94b2d34cf990b187094aacd708dde5d09bbfa3
		}
		this.column = column;
		this.row = row;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 7b94b2d34cf990b187094aacd708dde5d09bbfa3
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

=======
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
>>>>>>> 7b94b2d34cf990b187094aacd708dde5d09bbfa3
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}
}