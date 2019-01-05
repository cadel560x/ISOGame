package ie.gmit.sw.sprites;

import ie.gmit.sw.ImageManager;

public class Hole extends ObjectSprite{
	public Hole() {
		try {
			image = ImageManager.loadImage("./resources/images/objects/0009.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
