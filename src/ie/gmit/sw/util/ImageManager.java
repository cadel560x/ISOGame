package ie.gmit.sw.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * The Class ImageManager.
 */
public class ImageManager {
	/**
 * Load images.
 *
 * @param directory the directory
 * @param img the img
 * @return the buffered image[]
 * @throws Exception the exception
 */
public static BufferedImage[] loadImages(String directory, BufferedImage[] img) throws Exception {
		
		File dir = new File(directory);
		File[] files = dir.listFiles();
		Arrays.sort(files, (s, t) -> s.getName().compareTo(t.getName()));

		img = new BufferedImage[files.length];
		for (int i = 0; i < files.length; i++) {
			img[i] = ImageIO.read(files[i]);
		}
		return img;
	}
	
	/**
	 * Load image.
	 *
	 * @param file the file
	 * @return the buffered image
	 * @throws Exception the exception
	 */
	public static BufferedImage loadImage(String file) throws Exception {
		File imageFile = new File(file);
		
		return ImageIO.read(imageFile);
		
	} // end method
	
} // end class
