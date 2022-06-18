package chess;

public class Queen extends ChessPiece {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7351946009720951488L;

	public Queen(int theColor, String theName, String theTile) {
		super(theColor, theName, theTile);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void move() {
		
	}
	
	
	public boolean canCapture(ChessPiece[] theOtherPieces, ChessPiece thePiece) {
		for(int i = 0; i < theOtherPieces.length; i++) {
			if(theOtherPieces[i].canCapture(this))
				return false;
		}
		return this.canCapture(thePiece);
	}
	

}
