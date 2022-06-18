package chess;

public class Pawn extends ChessPiece{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7013175307196640189L;
	
	/**
	 * The condition where doubleMove is possible.
	 */
	private boolean doubleMove;

	public Pawn(int theColor, String theName, String theTile) {
		super(theColor, theName, theTile);
		this.doubleMove = true;
	}
	
	@Override
	public void move() {
		
	}
	
//	
//	public boolean canCapture(ChessPiece[] theOtherPieces, ChessPiece thePiece) {
//		for(int i = 0; i < theOtherPieces.length; i++) {
//			if(theOtherPieces[i].canCapture(this))
//				return false;
//		}
//		return this.canCapture(thePiece);
//	}
	
	



}
