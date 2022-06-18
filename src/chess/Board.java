package chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import util.Util;

public class Board {
	
	private static int DIM = 8;
	private static int WHITE = 0;
	private static int BLACK = 1;
	
	private static int IMAGE_WIDTH = 100;
	private static int IMAGE_HEIGHT = 100;
	
	
	

	private Tile[][] myBoard;
//	private int myDim;
	
	public Board() {
		this.myBoard = new Tile[DIM][DIM];
		int color = WHITE;
		String[] imgs = {"pawn", "knight", "bishop", "rook", "queen", "king"};
		String blk = "blk_";
		String wht = "wht_";
		
		Rook blkKRk = new Rook(BLACK, "blkKRk", "h8");
		Knight blkKKn = new Knight(BLACK, "blkKKn", "g8");
		Bishop blkKBis = new Bishop(BLACK, "blkKBis", "f8");
		King blkKing = new King(BLACK, "blkKg", "e8");
		Queen blkQueen = new Queen(BLACK, "blkQn", "d8");
		Bishop blkQBis = new Bishop(BLACK, "blkQBis", "c8");
		Knight blkQKn = new Knight(BLACK, "blkQKn", "b8");
		Rook blkQRk = new Rook(BLACK, "blkQRk", "a8");
		

		
		
		
		Rook whtKRk = new Rook(WHITE, "whtKRk", "h1");
		Knight whtKKn = new Knight(WHITE, "whtKKn", "g1");
		Bishop whtKBis = new Bishop(WHITE, "whtKBis", "f1");
		King whtKing = new King(WHITE, "whtKg", "e1");
		Queen whtQueen = new Queen(WHITE, "whtQn", "d1");
		Bishop whtQBis = new Bishop(WHITE, "whtQBis", "c1");
		Knight whtQKn = new Knight(WHITE, "whtQKn", "b1");
		Rook whtQRk = new Rook(WHITE, "whtQRk", "a1");
		
//		Util util = new Util();
		// Initialize the board
		for(int i = 0; i < DIM; i++) {
			for(int j = 0; j < DIM; j++) {
				this.myBoard[i][j] = new Tile("null", color);
				if(color == WHITE)
					color = BLACK;
				else
					color = WHITE;
			} // end for j
			if(color == WHITE)
				color = BLACK;
			else
				color = WHITE;
		} // end for i
		
		
		
		this.setPiece(blk + imgs[3], blkKRk, 0, 7);
		this.setPiece(blk + imgs[1], blkKKn, 0, 6);
		this.setPiece(blk + imgs[2], blkKBis, 0, 5);
		this.setPiece(blk + imgs[5], blkKing, 0, 4);
		this.setPiece(blk + imgs[4], blkQueen, 0, 3);
		this.setPiece(blk + imgs[2], blkQBis, 0, 2);
		this.setPiece(blk + imgs[1], blkQKn, 0, 1);
		this.setPiece(blk + imgs[3], blkQRk, 0, 0);
		
//		Pawn[] blkPwns = new Pawn[8];
		int a = 'a';
		for(int i = 0; i < DIM; i++) {
			String str = "" + ((char) (a + i)) + Integer.toString(i);
			Pawn blkPwn = new Pawn(BLACK, "blkPwn", str);
//			blkPwns[i] = blkPwn;
			this.setPiece(blk + imgs[0], blkPwn, 1, i);
		}
		
		
		this.setPiece(wht + imgs[3], whtKRk, 7, 7);
		this.setPiece(wht + imgs[1], whtKKn, 7, 6);
		this.setPiece(wht + imgs[2], whtKBis, 7, 5);
		this.setPiece(wht + imgs[5], whtKing, 7, 4);
		this.setPiece(wht + imgs[4], whtQueen, 7, 3);
		this.setPiece(wht + imgs[2], whtQBis, 7, 2);
		this.setPiece(wht + imgs[1], whtQKn, 7, 1);
		this.setPiece(wht + imgs[3], whtQRk, 7, 0);
		
//		Pawn[] whtPwns = new Pawn[8];
//		int a = 'a';
		for(int i = 0; i < DIM; i++) {
			String str = "" + ((char) (a + i)) + Integer.toString(i);
			Pawn whtPwn = new Pawn(WHITE, "whtPwn", str);
//			blkPwns[i] = blkPwn;
			this.setPiece(wht + imgs[0], whtPwn, 6, i);
		}

	} // end Board()
	
	
	public Tile[][] getBoard() {
		return this.myBoard;
	}
	
	public int getDim() {
		return DIM;
	}
	
	public Tile getTile(int i, int j) {
		return this.myBoard[i][j];
	}
	
	public void setTile(int i, int j, Tile theTile) {
		this.myBoard[i][j] = theTile;
	}
	
	public void setPiece(String theImageName, ChessPiece thePiece, int i, int j) {
		Util util = new Util();
		Image chessPieceImg = util.getImage(theImageName);
		Image scaledChessPiece = chessPieceImg.getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_SMOOTH);
		thePiece.add(new JLabel(new ImageIcon(scaledChessPiece)));
		thePiece.setVisible(true);
		this.myBoard[i][j].setPiece(thePiece);
	}

}
