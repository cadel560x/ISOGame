package ie.gmit.sw.util;

import ie.gmit.sw.model.sprites.Point;

// TODO: Auto-generated Javadoc
/**
 * The Class Iso.
 */
public class Iso {

	/**
	 * Gets the iso X.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the iso X
	 */
	public static int getIsoX(int x, int y) {
//		int rshift = (Properties.getDefaultViewSize() / 2) - (Properties.getTileWidth() / 2) + (x - y); // Pan camera to the right
//		return (x - y) * (Properties.getTileWidth() / 2) + rshift;
		
		int rshift = (Properties.getInteger("DEFAULT_VIEW_SIZE") / 2) - (Properties.getInteger("TILE_WIDTH") / 2) + (x - y); // Pan camera to the right
		return (x - y) * (Properties.getInteger("TILE_WIDTH") / 2) + rshift;
		
	} // end method

	
	/**
	 * Gets the iso Y.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the iso Y
	 */
	public static int getIsoY(int x, int y) {
//		return (x + y) * (Properties.getTileHeight() / 2);
		return (x + y) * (Properties.getInteger("TILE_HEIGHT") / 2);
		
	} // end method

	
	/**
	 * Gets the iso.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the iso
	 */
	public static Point getIso(int x, int y) {
		return new Point(getIsoX(x, y), getIsoY(x, y)); // Could be more efficient...
		
	} // end method

} // end class
