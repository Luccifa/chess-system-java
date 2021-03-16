package boardgame;

public class Piece {

	// protected => somente classes do mesmo pacote podem acessar
	protected Position positition;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.positition = null;
	}

	protected Board getBoard() {
		return board;
	}

}
