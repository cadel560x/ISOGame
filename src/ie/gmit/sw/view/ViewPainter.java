package ie.gmit.sw.view;

import java.awt.Graphics2D;

import ie.gmit.sw.model.sprites.objects.ObjectSprite;

// TODO: Auto-generated Javadoc
/**
 * The Interface ViewPainter.
 */
public interface ViewPainter {
	
	/**
	 * Paint view.
	 *
	 * @param g2 the g 2
	 * @param matrix the matrix
	 * @param things the things
	 */
	public void paintView(Graphics2D g2, ObjectSprite[][] matrix, ObjectSprite[][] things);
	
} // end interface
