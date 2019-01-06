package ie.gmit.sw.view;

import java.awt.*;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;
import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Iso;
import ie.gmit.sw.util.Properties;


// TODO: Auto-generated Javadoc
/**
 * The Class IsoView.
 */
//Strategy pattern
public class IsoView implements ViewPainter  { 
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.view.ViewPainter#paintView(java.awt.Graphics2D, ie.gmit.sw.model.sprites.objects.ObjectSprite[][], ie.gmit.sw.model.sprites.objects.ObjectSprite[][])
	 */
	@Override
	public void paintView(Graphics2D g2, ObjectSprite[][] matrix, ObjectSprite[][] things) {
		int x1 = 0, y1 = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				x1 = Iso.getIsoX(col, row);
				y1 = Iso.getIsoY(col, row);
				
				try {
					g2.drawImage(ImageManager.loadImage(Properties.get("GRASS_IMAGE_FILE")), x1, y1, null);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				g2.drawImage(matrix[row][col].getImage(), x1, y1, null);

				g2.drawImage(things[row][col].getImage(), x1, y1, null);
				
			} // end loop
			
		} // end loop
	
	} // end method
	
}  // end class