package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class Grass extends Tile{

	public Grass() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0000.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
