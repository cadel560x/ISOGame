package ie.gmit.sw.view;

import java.awt.*;
import java.awt.event.*;
//import java.awt.image.*;
import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.sprites.Point;
import ie.gmit.sw.sprites.avatars.Avatar;
import ie.gmit.sw.sprites.objects.ObjectSprite;
import ie.gmit.sw.sprites.objects.Tile;
import ie.gmit.sw.util.Iso;
import ie.gmit.sw.util.Properties;

//import javax.imageio.*;
//import java.io.*;
//import java.util.*;

/*
 * This is a God class and is doing way too much. The instance variables cover everything from isometric to 
 * Cartesian drawing and the class has methods for loading images and converting from one coordinate space to
 * another.
 * 
 */
public class GameView extends JPanel implements ActionListener  { 
	
	private static final long serialVersionUID = 777L;

	private Avatar player;
//	private ImageManager img;
//	private Iso iso;
//	private EventManager manager;

	private Timer timer; //Controls the repaint interval.

	//Do we really need two models like this?
//	private int[][] matrix;
//	private int[][] things;	
	
	private ObjectSprite[][] matrix;
	private ObjectSprite[][] things;
	
//	private BufferedImage[] tiles; //Note that all images, including sprites, have dimensions of 128 x 64. This make painting much simpler.
//	private BufferedImage[] objects; //Taller sprites can be created, by using two tiles (head torso, lower body and legs) and improve animations
//	private Color[] cartesian = {Color.GREEN, Color.GRAY, Color.DARK_GRAY, Color.ORANGE, Color.CYAN, Color.YELLOW, Color.PINK, Color.BLACK}; //This is a 2D representation
	
	private boolean isIsometric = true; //Toggle between 2D and Isometric (Z key)
	
	
	
	
//	public GameView(int[][] matrix, ObjectSprite[][] things, Player player) throws Exception {
	
//	public GameView(int[][] matrix, ObjectSprite[][] things, Avatar player) throws Exception {
	public GameView(ObjectSprite[][] matrix, ObjectSprite[][] things, Avatar player) throws Exception {
		this.player = player;
//		img = new ImageManager();
//		iso = new Iso();
		
		
//		init();
		this.matrix = matrix;
		this.things = things;
		
		setBackground(Color.WHITE);
		setDoubleBuffered(true); //Each image is buffered twice to avoid tearing / stutter
		
		timer = new Timer(100, this); //calls the actionPerformed() method every 100ms
		timer.start(); //Start the timer
	}
	
	
	
	
//	private void init() throws Exception {
//		tiles = img.loadImages("./resources/images/ground", tiles);
//		objects = img.loadImages("./resources/images/objects", objects);
//	}
	
	public void toggleView() {
		isIsometric = !isIsometric;
		this.repaint();
	}
	
	
	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		this.repaint();
	}

	
	public void paintComponent(Graphics g) { //This method needs to execute quickly...
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
//		int imageIndex = -1;
		int x1 = 0, y1 = 0;
		Point point;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
//				imageIndex = matrix[row][col];
				
//				if (imageIndex >= 0 && imageIndex < tiles.length) {
					//Paint the ground tiles
					if (isIsometric) {
						x1 = Iso.getIsoX(col, row);
						y1 = Iso.getIsoY(col, row);
						
//						g2.drawImage(tiles[Properties.getDefaultImageIndex()], x1, y1, null);
//						if (imageIndex > Properties.getDefaultImageIndex()) {
//							g2.drawImage(tiles[imageIndex], x1, y1, null);
//						}
						
						g2.drawImage(matrix[row][col].getImage(), x1, y1, null);
					} else {
//						x1 = col * Properties.getTileWidth();
						x1 = col * Properties.getInteger("TILE_WIDTH");
//						y1 = row * Properties.getTileHeight();
						y1 = row * Properties.getInteger("TILE_HEIGHT");
						
						Color tileColor = ((Tile)matrix[row][col]).getColor();
//	        			if (imageIndex < cartesian.length) {
						if (tileColor != null) {
//	        				g2.setColor(cartesian[imageIndex]);
							g2.setColor(tileColor);
	        			}else {
	        				g2.setColor(Color.WHITE);
	        			}
						
	        			g2.fillRect(x1, y1, Properties.getInteger("TILE_WIDTH"), Properties.getInteger("TILE_HEIGHT"));
					
					} // end if-else
					
					//Paint the object or things on the ground
//					imageIndex = things[row][col];
//					g2.drawImage(objects[imageIndex], x1, y1, null);
					
//					imageIndex = things[row][col];
					g2.drawImage(things[row][col].getImage(), x1, y1, null);
					
//				} // end if
				
			} // end loop
			
		} // end loop
		
		//Paint the player on  the ground
		point = Iso.getIso(player.getPosition().getX(), player.getPosition().getY());
		g2.drawImage(player.getImage(), point.getX(), point.getY(), null);
	
	} // end method
	
}  // end class