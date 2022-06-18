package chess;


public class King extends ChessPiece {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6386174654263807833L;
	
	public King(int theColor, String theName, String theTile) {
		super(theColor, theName, theTile);
//		setSize(0, 0);
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
