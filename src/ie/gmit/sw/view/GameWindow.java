package ie.gmit.sw.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import ie.gmit.sw.controllers.GameController;
import ie.gmit.sw.model.sprites.Point;
import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.avatars.AvatarFactory;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;
import ie.gmit.sw.model.sprites.objects.ObjectSpriteFactory;
import ie.gmit.sw.model.sprites.objects.TileFactory;
import ie.gmit.sw.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class GameWindow.
 */
public class GameWindow {
	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
	
/** The model. */
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
	
//	Flyweight pattern
	/** The objects. */
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
	
	/** The player. */
	private Avatar player;
	
	/** The view. */
	private GameView view;
	
	
	
	
	/**
	 * Instantiates a new game window.
	 *
	 * @throws Exception the exception
	 */
	public GameWindow() throws Exception {	
		player = AvatarFactory.getPlayerInstance();	
		player.setName("Player 1");
		player.setPosition(new Point(0,0));
		player.setMatrix(model);
		

		view = GameView.getInstance(model, objects, player);
		
		GameController manager = new GameController(player, view);
		
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
		
	} // end constructor
	
}  // end class