package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null; // nao precisa, por padrão se nao informar o java joga nulo;
	}
	protected Board getBoard() {
		return board;
	}
	
}
