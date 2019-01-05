package ie.gmit.sw.sprites;

import ie.gmit.sw.ImageManager;




public class AvatarFactory {
	
	public static Avatar getPlayerInstance() throws Exception {

		Avatar player = new Avatar(ImageManager.loadImages("./resources/images/sprites/default", null));

//		player.drawSprite(ImageManager.loadImages("./resources/images/sprites/default", null));

		return player;
		
	} // end method

	
	public static Avatar getKnightInstance() throws Exception {

		Avatar knight = new Avatar(ImageManager.loadImages("./resources/images/sprites/knight", null));

//		knight.drawSprite(ImageManager.loadImages("./resources/images/sprites/knight", null));

		return knight;
		
	} // end method
	
} // end class
