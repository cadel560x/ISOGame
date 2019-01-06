package ie.gmit.sw.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.swing.*;

import ie.gmit.sw.model.sprites.Point;
import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;
import ie.gmit.sw.util.Iso;




// TODO: Auto-generated Javadoc
/**
 * The Class GameView.
 */
public class GameView extends JPanel implements ActionListener  { 
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 777L;

/** The instance. */
//	Singleton
	private static GameView instance;
	
/** The player. */
//	Fields
	private Avatar player;
	
	/** The matrix. */
	private ObjectSprite[][] matrix;
	
	/** The things. */
	private ObjectSprite[][] things;
	
/** The view painter. */
//	Strategy pattern
	private ViewPainter viewPainter;

	
		
	
/**
 * Instantiates a new game view.
 *
 * @param matrix the matrix
 * @param things the things
 * @param player the player
 * @throws Exception the exception
 */
//	Constructors
	private GameView(ObjectSprite[][] matrix, ObjectSprite[][] things, Avatar player) throws Exception {
		this.player = player;

		this.matrix = matrix;
		this.things = things;
		
		setBackground(Color.WHITE);
		setDoubleBuffered(true); //Each image is buffered twice to avoid tearing / stutter
		
	}
	
	
	
	
/**
 * Gets the view painter.
 *
 * @return the view painter
 */
//	Getters and setters
	public ViewPainter getViewPainter() {
		return viewPainter;
	}

	/**
	 * Sets the view painter.
	 *
	 * @param viewPainter the new view painter
	 */
	public void setViewPainter(ViewPainter viewPainter) {
		this.viewPainter = viewPainter;
	}
	
	/**
	 * Gets the matrix.
	 *
	 * @return the matrix
	 */
	public ObjectSprite[][] getMatrix() {
		return matrix;
	}

	/**
	 * Sets the matrix.
	 *
	 * @param matrix the new matrix
	 */
	public void setMatrix(ObjectSprite[][] matrix) {
		this.matrix = matrix;
	}




	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	//	Abstract methods implementation
	@Override
	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		this.repaint();
	}

	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Point point;
		
//		Strategy pattern
		viewPainter.paintView(g2, matrix, things);
		
		//Paint the player on  the ground
		point = Iso.getIso(player.getPosition().getX(), player.getPosition().getY());
		g2.drawImage(player.getImage(), point.getX(), point.getY(), null);
		
	} // end method
	
	
	
	
/**
 * Gets the single instance of GameView.
 *
 * @param matrix the matrix
 * @param things the things
 * @param player the player
 * @return single instance of GameView
 */
//	Other methods
	public static GameView getInstance(ObjectSprite[][] matrix, ObjectSprite[][] things, Avatar player) {
	try {
		if (instance == null) {
			instance = new GameView(matrix, things, player);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	return instance;
	
	} // end method
	
	
	/**
	 * Gets the single instance of GameView.
	 *
	 * @return single instance of GameView
	 */
	public static GameView getInstance() {
		return instance;
	}
	
}  // end class