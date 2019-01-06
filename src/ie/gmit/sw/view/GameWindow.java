package ie.gmit.sw.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import ie.gmit.sw.controllers.EventManager;
import ie.gmit.sw.model.sprites.Point;
import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.avatars.AvatarFactory;
import ie.gmit.sw.model.sprites.objects.Chest;
import ie.gmit.sw.model.sprites.objects.Hole;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;
import ie.gmit.sw.model.sprites.objects.ObjectSpriteFactory;
import ie.gmit.sw.model.sprites.objects.Sign;
import ie.gmit.sw.model.sprites.objects.TileFactory;
import ie.gmit.sw.model.sprites.objects.Tree;
import ie.gmit.sw.util.Properties;

public class GameWindow {
	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
//	private int[][] model = { 
//			{ 1, 0, 0, 0, 0, 0 , 0, 0, 0, 2},
//			{ 0, 1, 0, 0, 0, 0 , 0, 0, 0, 2},
//			{ 0, 0, 2, 0, 0, 0 , 0, 0, 0, 2},
//			{ 0, 0, 0, 1, 0, 0 , 0, 0, 0, 2},
//			{ 2, 2, 2, 2, 1, 0 , 0, 0, 0, 2},
//			{ 3, 3, 3, 3, 1, 1 , 1, 0, 0, 1},
//			{ 5, 5, 5, 5, 3, 3 , 1, 0, 0, 1},
//			{ 4, 4, 4, 5, 3, 3 , 1, 0, 0, 0},
//			{ 4, 4, 4, 4, 5, 3 , 1, 6, 6, 6},
//			{ 4, 4, 4, 4, 4, 3 , 1, 7, 7, 7}
//	};
	
//	private ObjectSprite[][] model = { 
//			{ new Stone(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
//			{ new Grass(), new Stone(), new Grass(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
//			{ new Grass(), new Grass(), new GrassStone(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
//			{ new Grass(), new Grass(), new Grass(), new Stone(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
//			{ new GrassStone(), new GrassStone(), new GrassStone(), new GrassStone(), new Stone(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
//			{ new Sand(), new Sand(), new Sand(), new Sand(), new Stone(), new Stone() , new Stone(), new Grass(), new Grass(), new Stone()},
//			{ new SandWater(), new SandWater(), new SandWater(), new SandWater(), new Sand(), new Sand() , new Stone(), new Grass(), new Grass(), new Stone()},
//			{ new Water(), new Water(), new Water(), new SandWater(), new Sand(), new Sand() , new Stone(), new Grass(), new Grass(), new Grass()},
//			{ new Water(), new Water(), new Water(), new Water(), new SandWater(), new Sand() , new Stone(), new Mud(), new Mud(), new Mud()},
//			{ new Water(), new Water(), new Water(), new Water(), new Water(), new Sand() , new Stone(), new FineStone(), new FineStone(), new FineStone()}
//	};
	
//	Flyweight pattern
	private ObjectSprite[][] model = { 
			{ TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("stoneImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage")},
			{ TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("mudImage"), TileFactory.getTileInstance("mudImage"), TileFactory.getTileInstance("mudImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("fineStoneImage"), TileFactory.getTileInstance("fineStoneImage"), TileFactory.getTileInstance("fineStoneImage")}
	};
	
	//This matrix is a representation of where objects (things) in the game are placed
//	private int[][] objects = { 
//			{ 0, 0, 0, 5, 5, 5 , 5, 5, 5, 0},
//			{ 5, 0, 0, 0, 5, 5 , 5, 5, 5, 0},
//			{ 5, 5, 0, 0, 0, 5 , 5, 5, 5, 9},
//			{ 5, 5, 2, 0, 0, 0 , 5, 5, 5, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 5, 5, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 5, 0},
//			{ 0, 0, 0, 0, 0, 3 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0}
//	};
	
	//This matrix is a representation of where objects (things) in the game are placed
//		private ObjectSprite[][] objects = { 
//				{ new Air(), new Air(), new Air(), new Tree(), new Tree(), new Tree() , new Tree(), new Tree(), new Tree(), new Air()},
//				{ new Tree(), new Air(), new Air(), new Air(), new Tree(), new Tree() , new Tree(), new Tree(), new Tree(), new Air()},
//				{ new Tree(), new Tree(), new Air(), new Air(), new Air(), new Tree() , new Tree(), new Tree(), new Tree(), new Hole()},
//				{ new Tree(), new Tree(), new Sign(), new Air(), new Air(), new Air() , new Tree(), new Tree(), new Tree(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Tree(), new Tree(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Tree(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Chest() , new Air(), new Air(), new Air(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()},
//				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()}
//		};
	
//	Flyweight pattern
	//This matrix is a representation of where objects (things) in the game are placed
	private ObjectSprite[][] objects = { 
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance() , ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance() , ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getTreeInstance() , ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getHoleInstance()},
			{ ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getSignInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getTreeInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getChestInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance()},
			{ ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance() , ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance(), ObjectSpriteFactory.getAirInstance()}
	};
	
//	private ImageManager img;
	private Avatar player;
	
	
	
	
	public GameWindow() throws Exception {
		
//		img = new ImageManager();
//		player = new Avatar("Player 2", new Point(0, 0), img.loadImages("./resources/images/sprites/default", null));
//		player = new Avatar("Player 2", new Point(0, 0), ImageManager.loadImages("./resources/images/sprites/default", null));
		
		
		player = AvatarFactory.getPlayerInstance();
//		player = AvatarFactory.getKnightInstance();
//		player = AvatarFactory.getGreenInstance();
//		player = AvatarFactory.getPersonInstance();
		
		player.setName("Player 1");
		player.setPosition(new Point(0,0));
		
//		GameView view = new GameView(model, objects, player);
		GameView view = new GameView(model, objects, player);
		EventManager manager = new EventManager(player, view);
//		Dimension d = new Dimension(Properties.getDefaultViewSize(), Properties.getDefaultViewSize()/2);
		Dimension d = new Dimension(Properties.getInteger("DEFAULT_VIEW_SIZE"), Properties.getInteger("DEFAULT_VIEW_SIZE")/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);

		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.add(view);
		f.addKeyListener(manager);
		f.setSize(1000, 1000);
		f.setLocation(100, 100);
		f.pack();
		f.setVisible(true);
	}
}