package ie.gmit.sw.model.sprites.objects;

import java.awt.image.BufferedImage;

import ie.gmit.sw.model.sprites.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class ObjectSprite.
 */
public abstract class ObjectSprite extends Sprite {
//	Fields
	/** The image. */
	protected BufferedImage image;

	
	
//	Getters and setters
	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public BufferedImage getImage() {
		return image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(BufferedImage image) {
		this.image = image;
	}

} // end class
