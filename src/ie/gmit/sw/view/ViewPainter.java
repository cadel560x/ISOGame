package ie.gmit.sw.view;

//import java.awt.Graphics;
import java.awt.Graphics2D;

import ie.gmit.sw.model.sprites.objects.ObjectSprite;

public interface ViewPainter {
	
	public void paintView(Graphics2D g2, ObjectSprite[][] matrix, ObjectSprite[][] things);
	
} // end interface
