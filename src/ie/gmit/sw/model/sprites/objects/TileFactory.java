package ie.gmit.sw.sprites.objects;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;




// Singleton
public class TileFactory {
//	Data members
	private static TileFactory instance = new TileFactory();
	
	private static Map<String, BufferedImage> imageMap;
	private static Map<String, Color> colorMap;
	
	
	
	
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
	
	
	

//	Delegate methods
	public Color putColor(String key, Color value) {
		return colorMap.put(key, value);
	}
	
	public BufferedImage putImage(String key, BufferedImage value) {
		return imageMap.put(key, value);
	}
	
	
	
	
//	Other methods
	public static TileFactory getInstance() {
		return instance;
	}
	
	
	public static Tile getTileInstance(String tileName) throws Exception {
		Tile tile = new Tile();
		tile.image = imageMap.get(tileName);
		tile.setColor(colorMap.get(tileName));
		
		return tile;
		
	} // end method
	
} // end class
