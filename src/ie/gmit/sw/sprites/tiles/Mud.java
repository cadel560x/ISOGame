package ie.gmit.sw.sprites.tiles;

import ie.gmit.sw.ImageManager;

public class Mud extends Tile{

	public Mud() {
		try {
			image = ImageManager.loadImage("./resources/images/ground/0006.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
