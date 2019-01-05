package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class Sand extends Tile{

	public Sand() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0003.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
