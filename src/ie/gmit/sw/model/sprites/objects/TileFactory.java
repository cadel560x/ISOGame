package ie.gmit.sw.model.sprites.objects;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;




// TODO: Auto-generated Javadoc
/**
 * A factory for creating Tile objects.
 */
// Singleton
public class TileFactory {

/** The instance. */
//	Data members
	private static TileFactory instance = new TileFactory();
	
	/** The image map. */
	private static Map<String, BufferedImage> imageMap;
	
	/** The color map. */
	private static Map<String, Color> colorMap;
	
	
	
	
/**
 * Instantiates a new tile factory.
 */
//	Constructors
	private TileFactory() {
		imageMap = new HashMap<>();
		colorMap = new HashMap<>();
		
		try {
//			Flyweight pattern: intrinsic state
			imageMap.put("stoneImage", ImageManager.loadImage(Properties.get("STONE_IMAGE_FILE")));
			imageMap.put("grassImage", ImageManager.loadImage(Properties.get("GRASS_IMAGE_FILE")));
			imageMap.put("waterImage", ImageManager.loadImage(Properties.get("WATER_IMAGE_FILE")));
			imageMap.put("sandImage", ImageManager.loadImage(Properties.get("SAND_IMAGE_FILE")));
			imageMap.put("mudImage", ImageManager.loadImage(Properties.get("MUD_IMAGE_FILE")));
			imageMap.put("beachImage", ImageManager.loadImage(Properties.get("BEACH_IMAGE_FILE")));
			imageMap.put("fineStoneImage", ImageManager.loadImage(Properties.get("FINE_STONE_IMAGE_FILE")));
			imageMap.put("mossStoneImage", ImageManager.loadImage(Properties.get("MOSS_STONE_IMAGE_FILE")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		colorMap.put("stoneImage", Color.GRAY);
		colorMap.put("grassImage", Color.GREEN);
		colorMap.put("waterImage", Color.CYAN);
		colorMap.put("sandImage", Color.ORANGE);
		colorMap.put("mudImage", Color.PINK);
		colorMap.put("beachImage", Color.YELLOW);
		colorMap.put("fineStoneImage", Color.BLACK);
		colorMap.put("mossStoneImage", Color.DARK_GRAY);
		
	}
	
	
	

/**
 * Put color.
 *
 * @param key the key
 * @param value the value
 * @return the color
 */
//	Delegate methods
	public Color putColor(String key, Color value) {
		return colorMap.put(key, value);
	}
	
	/**
	 * Put image.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the buffered image
	 */
	public BufferedImage putImage(String key, BufferedImage value) {
		return imageMap.put(key, value);
	}
	
	
	
	
/**
 * Gets the single instance of TileFactory.
 *
 * @return single instance of TileFactory
 */
//	Other methods
	public static TileFactory getInstance() {
		return instance;
	}
	
	
	/**
	 * Gets the tile instance.
	 *
	 * @param tileName the tile name
	 * @return the tile instance
	 * @throws Exception the exception
	 */
	public static Tile getTileInstance(String tileName) throws Exception {
		Tile tile = new Tile();
		tile.image = imageMap.get(tileName);
		tile.setColor(colorMap.get(tileName));
		
		if(tileName.equals("waterImage")) {
			tile.setWater(true);
		}
		
		return tile;
		
	} // end method
	
} // end class
