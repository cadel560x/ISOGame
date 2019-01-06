package ie.gmit.sw.model.sprites.objects;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;



// Factory and Singleton
public class ObjectSpriteFactory {
//	Fields
	private static ObjectSpriteFactory instance = new ObjectSpriteFactory();
	
	private static Map<String, BufferedImage> imageMap;
	
	
	
	
//	Constructors
	private ObjectSpriteFactory() {
		imageMap = new HashMap<>();
		
		try {
			imageMap.put("treeImage", ImageManager.loadImage(Properties.get("TREE_IMAGE_FILE")));
			imageMap.put("signImage", ImageManager.loadImage(Properties.get("SIGN_IMAGE_FILE")));
			imageMap.put("chestImage", ImageManager.loadImage(Properties.get("CHEST_IMAGE_FILE")));
			imageMap.put("holeImage", ImageManager.loadImage(Properties.get("HOLE_IMAGE_FILE")));
			imageMap.put("airImage", ImageManager.loadImage(Properties.get("AIR_IMAGE_FILE")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
//	Other methods
	public static ObjectSpriteFactory getInstance() {
		return instance;
		
	} // end method

	
	public static Tree getTreeInstance() throws Exception {
		Tree tree = new Tree();
		tree.image = imageMap.get("treeImage");
		
		return tree;
		
	} // end method
	
	
	public static Air getAirInstance() throws Exception {
		Air air = new Air();
		air.image = imageMap.get("airImage");
		
		return air;
		
	} // end method
	
	
	public static Hole getHoleInstance() throws Exception {
		Hole hole = new Hole();
		hole.image = imageMap.get("holeImage");
		
		return hole;
		
	} // end method
	
	
	public static Chest getChestInstance() throws Exception {
		Chest chest = new Chest();
		chest.image = imageMap.get("ChestImage");
		
		return chest;
		
	} // end method
	
	
	public static Sign getSignInstance() throws Exception {
		Sign sign = new Sign();
		sign.image = imageMap.get("signImage");
		
		return sign;
		
	} // end method
	
} // end class
