package ie.gmit.sw.sprites.objects;

import java.awt.image.BufferedImage;

import ie.gmit.sw.sprites.Sprite;

public abstract class ObjectSprite extends Sprite {
//	Fields
	protected BufferedImage image;

	
	
	
//	Getters and setters
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

} // end class
