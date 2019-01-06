package ie.gmit.sw.util;

import java.util.HashMap;
import java.util.Map;




// TODO: Auto-generated Javadoc
/**
 * The Class Properties.
 */
// Singleton
public class Properties {

/** The instance. */
//	Fields
	private static Properties instance = new Properties();
	
	/** The properties. */
	private static Map<String, String> properties;
	
	
	
	
/**
 * Instantiates a new properties.
 */
//	Constructors
	private Properties() {
		properties = new HashMap<>();
		
		// Read the 'isogame.properties' file and populate the 'properties' map
		properties.put("DEFAULT_IMAGE_INDEX", "0");
		properties.put("DEFAULT_VIEW_SIZE", "1280");
		properties.put("TILE_WIDTH", "128");
		properties.put("TILE_HEIGHT", "64");
		
		properties.put("AVATAR_SPRITE_PATH", "./resources/images/sprites");
		properties.put("OBJECT_SPRITE_PATH", "./resources/images/objects");
		properties.put("TILE_SPRITE_PATH", "./resources/images/ground");
		String objectPath = properties.get("OBJECT_SPRITE_PATH");
		String tilePath = properties.get("TILE_SPRITE_PATH");
		String spritePath = properties.get("AVATAR_SPRITE_PATH");
		
		properties.put("DEFAULT_SPRITE_PATH", (spritePath + "/" + "default"));
		properties.put("GREEN_SPRITE_PATH", (spritePath + "/" + "green"));
		properties.put("KNIGHT_SPRITE_PATH", (spritePath + "/" + "knight"));
		properties.put("PERSON_SPRITE_PATH", (spritePath + "/" + "person"));
		
		properties.put("TREE_IMAGE_FILE", (objectPath + "/" + "0005.png"));
		properties.put("SIGN_IMAGE_FILE", (objectPath + "/" + "0002.png"));
		properties.put("CHEST_IMAGE_FILE", (objectPath + "/" + "0003.png"));
		properties.put("HOLE_IMAGE_FILE", (objectPath + "/" + "0009.png"));
		properties.put("AIR_IMAGE_FILE", (objectPath + "/" + "0000.png"));
		
		properties.put("GRASS_IMAGE_FILE", (tilePath + "/" + "0000.png"));
		properties.put("STONE_IMAGE_FILE", (tilePath + "/" + "0001.png"));
		properties.put("MOSS_STONE_IMAGE_FILE", (tilePath + "/" + "0002.png"));
		properties.put("SAND_IMAGE_FILE", (tilePath + "/" + "0003.png"));
		properties.put("WATER_IMAGE_FILE", (tilePath + "/" + "0004.png"));
		properties.put("BEACH_IMAGE_FILE", (tilePath + "/" + "0005.png"));
		properties.put("MUD_IMAGE_FILE", (tilePath + "/" + "0006.png"));
		properties.put("FINE_STONE_IMAGE_FILE", (tilePath + "/" + "0007.png"));
		
		
	}
	
	
	
	
/**
 * Gets the.
 *
 * @param key the key
 * @return the string
 */
//	Delegate methods
	public static String get(String key) {
		return properties.get(key);
	}
	
	
	
	
/**
 * Gets the single instance of Properties.
 *
 * @return single instance of Properties
 */
//	Other methods
	public static Properties getInstance() {
		return instance;
	}
	
	
	/**
	 * Gets the integer.
	 *
	 * @param key the key
	 * @return the integer
	 */
	public static int getInteger(String key) {
		return Integer.parseInt(get(key));
	}
	
	
	/**
	 * Gets the float.
	 *
	 * @param key the key
	 * @return the float
	 */
	public static float getFloat(String key) {
		return Float.parseFloat(get(key));
	}
	
} // end class
