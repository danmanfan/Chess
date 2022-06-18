package gui;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import chess.Board;
import chess.Tile;

public class JChessWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4114668888139429174L;
	
	private Board myBoard;
	

	public JChessWindow(Board theBoard) {
		this.myBoard = theBoard;
//		int w = this.getWidth();
//		int h = this.getHeight();
		JChessWindow thisWindow = this;
		int dim = this.myBoard.getDim();
		Board board = this.myBoard;
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
			

		});
		
//		addWindowStateListener(new WindowStateListener() {
//			public void windowStateChanged(WindowEvent e) {
//				int w = thisWindow.getWidth();
//				int h = thisWindow.getHeight();
//				System.out.println(h);
//				for(int i = 0; i < dim; i++) {
//					for(int j = 0; j < dim; j++) {
//						Tile tempTile = board.getTile(i, j);
//						int color = tempTile.getColor();
//						JPanel tile = new JPanel();
//						tile.setBounds((int)(j * w / dim),
//								(int) (i * h / dim),
//								(int) (w / dim),
//								(int) (h / dim));
//						if (color == 0)
//							tile.setBackground(Color.white);
//						else
//							tile.setBackground(Color.gray);
//						
//						if (tempTile.getPiece() != null) {
//							tile.add(tempTile.getPiece());
//						}
//						tile.setVisible(true);
//						thisWindow.add(tile);
//						
//					} // end for j
//				} // end for i
//			}
//		}); 
			
		
		
		

		
		repaint();
		
		
	} // End JChessWindow()
	
	
	
//	public void changeOfWindowState(int dim, Board theBoard) {
//		int w = this.getWidth();
//		int h = this.getHeight();
//		JChessWindow thisWindow = this;
//		addWindowListener(new WindowAdapter() {
//			public void windowStateChanged(WindowEvent e) {
//				System.out.println(w);
//				for(int i = 0; i < dim; i++) {
//					for(int j = 0; j < dim; j++) {
//						Tile tempTile = theBoard.getTile(i, j);
//						int color = tempTile.getColor();
//						JPanel tile = new JPanel();
////						int w = this.myJChessWindow.getWidth();
////						int h = this.myJChessWindow.getHeight();
//						tile.setBounds((int)(j * w / dim),
//								(int) (i * h / dim),
//								(int) (w / dim),
//								(int) (h / dim));
//						if (color == 0)
//							tile.setBackground(Color.white);
//						else
//							tile.setBackground(Color.gray);
//						
//						if (tempTile.getPiece() != null) {
//							tile.add(tempTile.getPiece());
//						}
//						tile.setVisible(true);
//						thisWindow.add(tile);
//
//						
//						
//						
//					} // end for j
//				} // end for i
//			}
//		});
//		repaint();
//	}
	
	public void setBoard(Board theBoard) {
		this.myBoard = theBoard;
	}

}
