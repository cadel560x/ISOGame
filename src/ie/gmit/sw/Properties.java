package ie.gmit.sw;

import java.util.HashMap;
import java.util.Map;




// Singleton
public class Properties {
//	Fields
	private static Properties instance = new Properties();
	
	private static Map<String, String> properties;
	
	
	
	
//	Constructors
	private Properties() {
		properties = new HashMap<>();
		
		// Read the 'isogame.properties' file and populate the 'properties' map
		properties.put("DEFAULT_IMAGE_INDEX", "0");
		properties.put("DEFAULT_VIEW_SIZE", "1280");
		properties.put("TILE_WIDTH", "128");
		properties.put("TILE_HEIGHT", "64");
		
		String objectPath = "./resources/images/objects";
		String spritePath = "./resources/images/sprites";
		properties.put("AVATAR_SPRITE_PATH", spritePath);
		properties.put("OBJECT_SPRITE_PATH", objectPath);
		
		properties.put("TREE_IMAGE_FILE", (objectPath + "/" + "0005.png"));
		
	}
	
	
	
	
//	Delegate methods
	public static String get(String key) {
		return properties.get(key);
	}
	
	
	
	
//	Other methods
	public static Properties getInstance() {
		return instance;
	}
	
	
	public static int getInteger(String key) {
		return Integer.parseInt(get(key));
	}
	
	
	public static float getFloat(String key) {
		return Float.parseFloat(get(key));
	}
	
	
//	public static String getString(String key) {
//		return (String) get(key);
//	}
	
//	private static final int DEFAULT_IMAGE_INDEX = 0;
//	private static final int DEFAULT_VIEW_SIZE = 1280;
//	private static final int TILE_WIDTH = 128;
//	private static final int TILE_HEIGHT = 64;
	
//	public static int getDefaultImageIndex() {
//		return DEFAULT_IMAGE_INDEX;
//	}
//	public static int getDefaultViewSize() {
//		return DEFAULT_VIEW_SIZE;
//	}
//	public static int getTileWidth() {
//		return TILE_WIDTH;
//	}
//	public static int getTileHeight() {
//		return TILE_HEIGHT;
//	}
	
} // end class
