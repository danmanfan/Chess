package chess;

public interface GamePiece {
	
	public void move();
	public boolean canCapture(GamePiece thePiece);
	public boolean canMove(String theTile);
	boolean canCapture(ChessPiece thePiece);
	

}
