package boardgame;

public abstract class Piece {

	// protected => somente classes do mesmo pacote podem acessar
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] math = possibleMoves();
		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j < math.length; j++) {
				if (math[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
