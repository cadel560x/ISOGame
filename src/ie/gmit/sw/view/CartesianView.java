package ie.gmit.sw.view;

import java.awt.*;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;
import ie.gmit.sw.model.sprites.objects.Tile;
import ie.gmit.sw.util.Properties;




// TODO: Auto-generated Javadoc
/**
 * The Class CartesianView.
 */
//Strategy pattern
public class CartesianView implements ViewPainter  { 

	/* (non-Javadoc)
	 * @see ie.gmit.sw.view.ViewPainter#paintView(java.awt.Graphics2D, ie.gmit.sw.model.sprites.objects.ObjectSprite[][], ie.gmit.sw.model.sprites.objects.ObjectSprite[][])
	 */
	@Override
	public void paintView(Graphics2D g2, ObjectSprite[][] matrix, ObjectSprite[][] things) { //This method needs to execute quickly...
		int x1 = 0, y1 = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
					x1 = col * Properties.getInteger("TILE_WIDTH");
					y1 = row * Properties.getInteger("TILE_HEIGHT");
					
					Color tileColor = ((Tile)matrix[row][col]).getColor();
					if (tileColor != null) {
						g2.setColor(tileColor);
        			}else {
        				g2.setColor(Color.WHITE);
        			}
					
        			g2.fillRect(x1, y1, Properties.getInteger("TILE_WIDTH"), Properties.getInteger("TILE_HEIGHT"));
					
					g2.drawImage(things[row][col].getImage(), x1, y1, null);
					
				
			} // end loop
			
		} // end loop
	
	} // end method
	
}  // end class