package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

import chess.Board;
import chess.Tile;
import util.Util;

public class GUI {

	
	private static int MAX_HEIGHT = 800; 
	private static int MAX_WIDTH = 800;
	
	private Board myBoard;
	private JChessWindow myJChessWindow;
	
	
	public GUI() {
		this.myBoard = new Board();
		this.myJChessWindow = new JChessWindow(this.myBoard);
	}
	
	
	public void start() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		this.myJChessWindow.setSize(MAX_WIDTH, MAX_HEIGHT);
		this.myJChessWindow.setLocation((int) (width - MAX_WIDTH) / 2, (int) (height - MAX_HEIGHT) / 2);
		
		
//		this.myBoard.getBoard();
		int dim = this.myBoard.getDim();

		for(int i = 0; i < dim; i++) {
			for(int j = 0; j < dim; j++) {
				Tile tempTile = this.myBoard.getTile(i, j);
				int color = tempTile.getColor();
				JPanel tile = new JPanel();
				tile.setBounds((int)(j * this.myJChessWindow.getWidth() / (dim + 2)),
						(int) (i * this.myJChessWindow.getHeight() / (dim + 2)),
						(int) (this.myJChessWindow.getWidth() / (dim + 2)),
						(int) (this.myJChessWindow.getHeight() / (dim + 2)));
				if (color == 0)
					tile.setBackground(Color.lightGray);
				else
					tile.setBackground(Color.gray);
				if (tempTile.getPiece() != null) {
					tempTile.getPiece().setBounds(0, 0,
							(int) (this.myJChessWindow.getWidth() / (dim + 2)),
							(int) (this.myJChessWindow.getHeight() / (dim + 2)));
					tempTile.getPiece().setBackground(tile.getBackground());
					tile.add(tempTile.getPiece());									
				}
				tile.setVisible(true);
				this.myJChessWindow.add(tile);
			} // end for j
		} // end for i
		JPanel tile = new JPanel();
		tile.setBackground(Color.DARK_GRAY);
		this.myJChessWindow.add(tile);
		this.myJChessWindow.setVisible(true);
	}
	
	
	
	public void setBoard(Board theBoard) {
		this.myBoard = theBoard;
	}
	
}
