package boardgame;

public class Piece {

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

}
