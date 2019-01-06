package ie.gmit.sw.sprites.avatars;

import ie.gmit.sw.util.ImageManager;




public class AvatarFactory {
	
	public static Avatar getPlayerInstance() throws Exception {
		Avatar player = new Avatar(ImageManager.loadImages("./resources/images/sprites/default", null));
		return player;
		
	} // end method

	
	public static Avatar getKnightInstance() throws Exception {
		Avatar knight = new Avatar(ImageManager.loadImages("./resources/images/sprites/knight", null));
		return knight;
		
	} // end method
	
	
	public static Avatar getGreenInstance() throws Exception {
		Avatar green = new Avatar(ImageManager.loadImages("./resources/images/sprites/green", null));
		return green;
		
	} // end method
	
	
	public static Avatar getPersonInstance() throws Exception {
		Avatar person = new Avatar(ImageManager.loadImages("./resources/images/sprites/person", null));
		return person;
		
	} // end method
	
} // end class
