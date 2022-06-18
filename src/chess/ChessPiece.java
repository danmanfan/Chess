package chess;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

/**
 * 
 * @author Daniel Flynn
 * Generate Chess Piece objects.
 */
public class ChessPiece extends JPanel implements GamePiece{
	
	/**
	 * The Serial Version UID
	 */
	private static final long serialVersionUID = 5148375882873009166L;
	
	


	/**
	 * The Color of the Chess Piece
	 */
	private int myColor;
	
	/**
	 * The name of the Chess Piece.
	 */
	private String myName;
	
	/**
	 * The Tile position of the Chess Piece.
	 */
	private String myTile;
	
	/**
	 * Condition that the Chess Piece is Selected.
	 */
	private boolean pieceSelected;
	
	/**
	 * Will determine if given Chess Piece is Selectable.
	 */
	public static boolean canSelect = true;

	/**
	 * Chess Piece Constructor.
	 * @param theColor The Color of the Chess Piece as an integer, 0 for WHITE 1 for BLACK.
	 * @param theName The name of the Chess Piece.
	 * @param theTile The Tile Position of the Chess Piece.
	 */
	public ChessPiece(int theColor, String theName, String theTile) {
		this.myColor = theColor;
		this.myName = theName;
		this.myTile = theTile;
		this.pieceSelected = false;
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
//				this.pieceSelected = true;
				
				if(pieceSelected) {
					pieceSelected = false;
					canSelect = true;
				}
				
				else if(canSelect) {
				pieceSelected = !pieceSelected;
				canSelect = false;
				}

				
				System.out.println(myName + "clicked" + "and is selected == " + pieceSelected);
				System.out.println("can select == " + canSelect);
			}
			
		});
		
	}

	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCapture(ChessPiece thePiece) {
		if(this.myColor != thePiece.getColor())
			return true;
		return false;
	}
	
	
	
	public boolean canCapture(ChessPiece[] theOtherPieces, ChessPiece thePiece) {
		for(int i = 0; i < theOtherPieces.length; i++) {
			if(theOtherPieces[i].canCapture(this))
				return false;
		}
		return this.canCapture(thePiece);
	}


	@Override
	public boolean canMove(String theTile) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	/**************************************************************/

	
	public int getColor() {
		return this.myColor;
	}

	public String getName() {
		return this.myName;
	}
	
	public String getTile() {
		return this.myTile;
	}
	
	/**************************************************************/
	

	public void setName(String theName) {
		this.myName = theName;
	}
	
	public void setTile(String theTile) {
		this.myTile = theTile;
	}


	@Override
	public boolean canCapture(GamePiece thePiece) {
		// TODO Auto-generated method stub
		return false;
	}







	


}
