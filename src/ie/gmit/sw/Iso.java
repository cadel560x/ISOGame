package ie.gmit.sw;

public class Iso {

	public int getIsoX(int x, int y) {
//		int rshift = (Properties.getDefaultViewSize() / 2) - (Properties.getTileWidth() / 2) + (x - y); // Pan camera to the right
//		return (x - y) * (Properties.getTileWidth() / 2) + rshift;
		
		int rshift = (Properties.getInteger("DEFAULT_VIEW_SIZE") / 2) - (Properties.getInteger("TILE_WIDTH") / 2) + (x - y); // Pan camera to the right
		return (x - y) * (Properties.getInteger("TILE_WIDTH") / 2) + rshift;
		
	} // end method

	
	public int getIsoY(int x, int y) {
//		return (x + y) * (Properties.getTileHeight() / 2);
		return (x + y) * (Properties.getInteger("TILE_HEIGHT") / 2);
	}

	
	public Point getIso(int x, int y) {
		return new Point(getIsoX(x, y), getIsoY(x, y)); // Could be more efficient...
	}

} // end class
