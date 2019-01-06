package ie.gmit.sw.model.sprites.objects;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import ie.gmit.sw.util.ImageManager;
import ie.gmit.sw.util.Properties;



// TODO: Auto-generated Javadoc
/**
 * A factory for creating ObjectSprite objects.
 */
// Factory and Singleton
public class ObjectSpriteFactory {

/** The instance. */
	private static ObjectSpriteFactory instance = new ObjectSpriteFactory();
//	Fields
	/** The image map. */
	private static Map<String, BufferedImage> imageMap;
	
	
	
	
/**
 * Instantiates a new object sprite factory.
 */
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
	/**
	 * Gets the single instance of ObjectSpriteFactory.
	 *
	 * @return single instance of ObjectSpriteFactory
	 */
	public static ObjectSpriteFactory getInstance() {
		return instance;
		
	} // end method

	
	/**
	 * Gets the tree instance.
	 *
	 * @return the tree instance
	 * @throws Exception the exception
	 */
	public static Tree getTreeInstance() throws Exception {
		Tree tree = new Tree();
		tree.image = imageMap.get("treeImage");
		
		return tree;
		
	} // end method
	
	
	/**
	 * Gets the air instance.
	 *
	 * @return the air instance
	 * @throws Exception the exception
	 */
	public static Air getAirInstance() throws Exception {
		Air air = new Air();
		air.image = imageMap.get("airImage");
		
		return air;
		
	} // end method
	
	
	/**
	 * Gets the hole instance.
	 *
	 * @return the hole instance
	 * @throws Exception the exception
	 */
	public static Hole getHoleInstance() throws Exception {
		Hole hole = new Hole();
		hole.image = imageMap.get("holeImage");
		
		return hole;
		
	} // end method
	
	
	/**
	 * Gets the chest instance.
	 *
	 * @return the chest instance
	 * @throws Exception the exception
	 */
	public static Chest getChestInstance() throws Exception {
		Chest chest = new Chest();
		chest.image = imageMap.get("ChestImage");
		
		return chest;
		
	} // end method
	
	
	/**
	 * Gets the sign instance.
	 *
	 * @return the sign instance
	 * @throws Exception the exception
	 */
	public static Sign getSignInstance() throws Exception {
		Sign sign = new Sign();
		sign.image = imageMap.get("signImage");
		
		return sign;
		
	} // end method
	
} // end class
