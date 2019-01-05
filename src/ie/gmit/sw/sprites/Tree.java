package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;
import java.io.File;

import ie.gmit.sw.ImageManager;

public class Tree extends ObjectSprite {
	
	public Tree() {
		try {
			image = ImageManager.loadImage("./resources/images/objects/0005.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public onCollision(Collider collider) {
//		// interaction
//	}
	
	 
}
