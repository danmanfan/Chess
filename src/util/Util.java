package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Util {
	
	public Image getImage(String theImage) {
		Image img = null;
		try {
			img = new ImageIcon( this.getClass().getResource("sources/sprites/" + theImage + ".png") ).getImage();
			System.out.println("Image got");
		} catch (Exception e) {
			System.out.println("Something is wrong with image getter");
		}
		
		return img;
	}
	
	public BufferedImage getBuffImage(String theImage) {
		BufferedImage img = null;
		try {
//			img = ImageIO.read(new File("sources/sprites/" + theImage + ".png"));
			img = ImageIO.read(this.getClass().getResource("sources/sprites/" + theImage + ".png"));
//			System.out.println("buffImage got");
		} catch (IOException e) {
			System.out.println("Something is wrong with the buffImage getter");
		}
		return img;
	}

}