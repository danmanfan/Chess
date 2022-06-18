package chess;

public class Tile {
	
	private String myName;
	private ChessPiece myPiece;
	private int myColor;
	
	public Tile(String theName, int theColor) {
		this.myName = theName;
		this.myPiece = null;
		this.myColor = theColor;
	}
	
	public Tile(String theName, ChessPiece thePiece, int theColor) {
		this.myName = theName;
		this.myPiece = thePiece;
		this.myColor = theColor;
	}
	
	public boolean isOccupied() {
		if(this.myPiece == null)
			return false;
		return true;
	}
	
	/**************************************************************/
	
	public String getName() {
		return this.myName;
	}
	
	public ChessPiece getPiece() {
		return this.myPiece;
	}
	
	public int getColor() {
		return this.myColor;
	}
	
	/**************************************************************/

	
	public void setPiece(ChessPiece thePiece) {
		this.myPiece = thePiece;
	}
}
