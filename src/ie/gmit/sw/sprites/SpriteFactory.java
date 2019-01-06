package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import java.util.HashMap;
import java.util.Map;


import ie.gmit.sw.ImageManager;

// Singleton
public class SpriteFactory {
	
	private static SpriteFactory instance = new SpriteFactory();
	
	private static Map<String, BufferedImage> imageMap;
	
	private SpriteFactory() {
		imageMap = new HashMap<>();
		
		try {
			imageMap.put("treeImage", ImageManager.loadImage("resources/images/objects/0005.png"));
			imageMap.put("signImage", ImageManager.loadImage("resources/images/objects/0002.png"));
			imageMap.put("chestImage", ImageManager.loadImage("resources/images/objects/0003.png"));
			imageMap.put("holeImage", ImageManager.loadImage("resources/images/objects/0009.png"));
			imageMap.put("airImage", ImageManager.loadImage("resources/images/objects/0000.png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static SpriteFactory getInstance() {
		return instance;
	}
	
	
	public static PlayerSprite playerInstance() throws Exception {
		
		PlayerSprite player = new PlayerSprite();
		
		player.drawSprite(ImageManager.loadImages("./resources/images/sprites/default", null));
		
		return player;
	}
	
	public static PlayerSprite knightInstance() throws Exception {
		
		PlayerSprite player = new PlayerSprite();
		
		player.setName("Knight 1");
		player.setPosition(new Point(0,0));
		player.drawSprite(ImageManager.loadImages("./resources/images/sprites/knight", null));
		
		return player;
	}
	
	public static Tree treeInstance() throws Exception {
		Tree tree = new Tree();
		tree.image = imageMap.get("treeImage");
		
		return tree;
	}
	
	public static Air airInstance() throws Exception {
		Air air = new Air();
		air.image = imageMap.get("airImage");
		
		return air;
	}
	
	public static Hole holeInstance() throws Exception {
		Hole hole = new Hole();
		hole.image = imageMap.get("holeImage");
		
		return hole;
	}
	
	public static Chest chestInstance() throws Exception {
		Chest chest = new Chest();
		chest.image = imageMap.get("chestImage");
		
		return chest;
	}
	
	public static Sign signInstance() throws Exception {
		Sign sign = new Sign();
		sign.image = imageMap.get("signImage");
		
		return sign;
	}
	
}