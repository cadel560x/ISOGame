package ie.gmit.sw.sprites;

import ie.gmit.sw.ImageManager;

public class Sign extends ObjectSprite{
	public Sign() {
		try {
			image = ImageManager.loadImage("./resources/images/objects/0002.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
