package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class GrassStone extends Tile {

	public GrassStone() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0002.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
