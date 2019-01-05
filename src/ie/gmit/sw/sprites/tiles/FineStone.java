package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class FineStone extends Tile{

	public FineStone() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0007.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
