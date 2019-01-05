package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import java.util.HashMap;
import java.util.Map;


import ie.gmit.sw.ImageManager;

// Singleton
public class TileFactory {
	private static TileFactory instance = new TileFactory();
	
	private static Map<String, BufferedImage> imageMap;
	
	
	private TileFactory() {
		imageMap = new HashMap<>();
		
		try {
//			Flyweight pattern: intrinsic state
			imageMap.put("stoneImage", ImageManager.loadImage("resources/images/ground/0001.png"));
			imageMap.put("grassImage", ImageManager.loadImage("resources/images/ground/0000.png"));
			imageMap.put("waterImage", ImageManager.loadImage("resources/images/ground/0004.png"));
			imageMap.put("sandImage", ImageManager.loadImage("resources/images/ground/0003.png"));
			imageMap.put("mudImage", ImageManager.loadImage("resources/images/ground/0006.png"));
			imageMap.put("beachImage", ImageManager.loadImage("resources/images/ground/0005.png"));
			imageMap.put("fineStoneImage", ImageManager.loadImage("resources/images/ground/0007.png"));
			imageMap.put("mossStoneImage", ImageManager.loadImage("resources/images/ground/0002.png"));
			
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
