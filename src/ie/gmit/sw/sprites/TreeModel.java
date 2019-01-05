package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import ie.gmit.sw.ImageManager;
import ie.gmit.sw.Properties;




// Singleton & Flyweight pattern: The intrinsic state of the flyweight pattern is a singleton
public class TreeModel {
//	Fields
	private static TreeModel instance = new TreeModel();
	
	private static String imageFile;
	private static BufferedImage image;
	
	
//	Constructors
	private TreeModel() {
		try {
			imageFile = Properties.get("TREE_IMAGE_FILE");
			image = ImageManager.loadImage(imageFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		} // end try-catch
		
	}
	
	
	
	
//	Getters and setters
	public static String getImageFile() {
		return imageFile;
	}

//	public void setImageFile(String imageFile) {
//		this.imageFile = imageFile;
//	}

	public static BufferedImage getImage() {
		return image;
	}

//	public void setImage(BufferedImage image) {
//		this.image = image;
//	}



	
	//	Other methods
	public static TreeModel getInstance() {
		return instance;
	}
	
} // end class
