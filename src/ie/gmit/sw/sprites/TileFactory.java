package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import java.util.HashMap;
import java.util.Map;


import ie.gmit.sw.ImageManager;
import ie.gmit.sw.Properties;

// Singleton
public class TileFactory {
	private static TileFactory instance = new TileFactory();
	
	private static Map<String, BufferedImage> imageMap;
	
	
	private TileFactory() {
		imageMap = new HashMap<>();
		
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
	}
	
	
	public static TileFactory getInstance() {
		return instance;
	}
	
	
	public static Tile getTileInstance(String tileName) throws Exception {
		Tile tile = new Tile();
		tile.image = imageMap.get(tileName);
		
		return tile;
	}
	
	
}
