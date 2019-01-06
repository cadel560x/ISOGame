package ie.gmit.sw.model.sprites.avatars;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;




public class AvatarFactory {
	
	public static Avatar getPlayerInstance() throws Exception {
		Avatar player = new Avatar(ImageManager.loadImages(Properties.get("DEFAULT_SPRITE_PATH"), null));
		return player;
		
	} // end method

	
	public static Avatar getKnightInstance() throws Exception {
		Avatar knight = new Avatar(ImageManager.loadImages(Properties.get("KNIGHT_SPRITE_PATH"), null));
		return knight;
		
	} // end method
	
	
	public static Avatar getGreenInstance() throws Exception {
		Avatar green = new Avatar(ImageManager.loadImages(Properties.get("GREEN_SPRITE_PATH"), null));
		return green;
		
	} // end method
	
	
	public static Avatar getPersonInstance() throws Exception {
		Avatar person = new Avatar(ImageManager.loadImages(Properties.get("PERSON_SPRITE_PATH"), null));
		return person;
		
	} // end method
	
} // end class
