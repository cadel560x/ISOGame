package ie.gmit.sw;

import java.awt.*;
import java.awt.event.KeyListener;

import javax.swing.*;

import ie.gmit.sw.sprites.ObjectSprite;
import ie.gmit.sw.sprites.PlayerSprite;
import ie.gmit.sw.sprites.Point;
import ie.gmit.sw.sprites.SpriteFactory;
import ie.gmit.sw.sprites.Spriteable;
import ie.gmit.sw.sprites.TileFactory;
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
//			{ TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 3, 3 , 1, 0, 0, 1},
//			{ 4, 4, 4, TileFactory.getTileInstance("beachImage"), 3, 3 , 1, 0, 0, 0},
//			{ 4, 4, 4, 4, TileFactory.getTileInstance("beachImage"), 3 , 1, 6, 6, 6},
//			{ 4, 4, 4, 4, 4, 3 , 1, 7, 7, 7}
//	};
	
	private ObjectSprite[][] model = { 
			{ TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("mossStoneImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage") , TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("mossStoneImage")},
			{ TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("stoneImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage")},
			{ TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("stoneImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("sandImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage"), TileFactory.getTileInstance("grassImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("mudImage"), TileFactory.getTileInstance("mudImage"), TileFactory.getTileInstance("mudImage")},
			{ TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("waterImage"), TileFactory.getTileInstance("sandImage") , TileFactory.getTileInstance("stoneImage"), TileFactory.getTileInstance("fineStoneImage"), TileFactory.getTileInstance("fineStoneImage"), TileFactory.getTileInstance("fineStoneImage")}
	};
	
	//This matrix is a representation of where objects (things) in the game are placed
//	private int[][] objects = { 
//			{ 0, 0, 0, TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage") , TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 0},
//			{ TileFactory.getTileInstance("beachImage"), 0, 0, 0, TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage") , TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 0},
//			{ TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 0, 0, 0, TileFactory.getTileInstance("beachImage") , TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 9},
//			{ TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 2, 0, 0, 0 , TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, TileFactory.getTileInstance("beachImage"), TileFactory.getTileInstance("beachImage"), 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, TileFactory.getTileInstance("beachImage"), 0},
//			{ 0, 0, 0, 0, 0, 3 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
//			{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0}
//	};
//	

//	Flyweight & Factory patterns
	private ObjectSprite[][] objects = { 
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance() , SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.treeInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance() , SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.treeInstance() , SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.holeInstance()},
			{ SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.signInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.airInstance(), SpriteFactory.treeInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.treeInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.chestInstance() , SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance()},
			{ SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance() , SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance(), SpriteFactory.airInstance()}
	};
	
	
	
	private ImageManager img;
	private PlayerSprite player;
	
	public GameWindow() throws Exception {
		
		img = new ImageManager();
		
		player = SpriteFactory.knightInstance();
		player.setName("Player 1");
		player.setPosition(new Point(0,0));
	
		GameView view = new GameView(model, objects, player);
		EventManager manager = new EventManager(player, objects);
		Dimension d = new Dimension(Properties.getDefaultViewSize(), Properties.getDefaultViewSize()/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);

		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.add(view);
		f.addKeyListener(manager);
		f.setSize(500, 500);
		f.setLocation(100, 100);
		f.pack();
		f.setVisible(true);
	}
}