package ie.gmit.sw.model.sprites.avatars;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;




// TODO: Auto-generated Javadoc
/**
 * A factory for creating Avatar objects.
 */
public class AvatarFactory {
	
	/**
	 * Gets the player instance.
	 *
	 * @return the player instance
	 * @throws Exception the exception
	 */
	public static Avatar getPlayerInstance() throws Exception {
		Avatar player = new Avatar(ImageManager.loadImages(Properties.get("DEFAULT_SPRITE_PATH"), null));
		return player;
		
	} // end method

	
	/**
	 * Gets the knight instance.
	 *
	 * @return the knight instance
	 * @throws Exception the exception
	 */
	public static Avatar getKnightInstance() throws Exception {
		Avatar knight = new Avatar(ImageManager.loadImages(Properties.get("KNIGHT_SPRITE_PATH"), null));
		return knight;
		
	} // end method
	
	
	/**
	 * Gets the green instance.
	 *
	 * @return the green instance
	 * @throws Exception the exception
	 */
	public static Avatar getGreenInstance() throws Exception {
		Avatar green = new Avatar(ImageManager.loadImages(Properties.get("GREEN_SPRITE_PATH"), null));
		return green;
		
	} // end method
	
	
	/**
	 * Gets the person instance.
	 *
	 * @return the person instance
	 * @throws Exception the exception
	 */
	public static Avatar getPersonInstance() throws Exception {
		Avatar person = new Avatar(ImageManager.loadImages(Properties.get("PERSON_SPRITE_PATH"), null));
		return person;
		
	} // end method
	
} // end class
