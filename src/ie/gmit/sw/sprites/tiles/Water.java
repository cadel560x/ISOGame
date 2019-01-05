package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class Water extends Tile{

	public Water() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0004.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
