package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class SandWater extends Tile{

	public SandWater() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0005.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
