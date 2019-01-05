package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class Stone extends Tile{

	public Stone() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0001.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
