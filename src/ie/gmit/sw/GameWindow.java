package ie.gmit.sw;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import ie.gmit.sw.sprites.Air;
import ie.gmit.sw.sprites.Chest;
import ie.gmit.sw.sprites.Hole;
import ie.gmit.sw.sprites.ObjectSprite;
import ie.gmit.sw.sprites.Avatar;
import ie.gmit.sw.sprites.AvatarFactory;
import ie.gmit.sw.sprites.Sign;
import ie.gmit.sw.sprites.Tree;
import ie.gmit.sw.sprites.tiles.FineStone;
import ie.gmit.sw.sprites.tiles.Grass;
import ie.gmit.sw.sprites.tiles.GrassStone;
import ie.gmit.sw.sprites.tiles.Mud;
import ie.gmit.sw.sprites.tiles.Sand;
import ie.gmit.sw.sprites.tiles.SandWater;
import ie.gmit.sw.sprites.tiles.Stone;
import ie.gmit.sw.sprites.tiles.Water;
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
	
	private ObjectSprite[][] model = { 
			{ new Stone(), new Grass(), new Grass(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
			{ new Grass(), new Stone(), new Grass(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
			{ new Grass(), new Grass(), new GrassStone(), new Grass(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
			{ new Grass(), new Grass(), new Grass(), new Stone(), new Grass(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
			{ new GrassStone(), new GrassStone(), new GrassStone(), new GrassStone(), new Stone(), new Grass() , new Grass(), new Grass(), new Grass(), new GrassStone()},
			{ new Sand(), new Sand(), new Sand(), new Sand(), new Stone(), new Stone() , new Stone(), new Grass(), new Grass(), new Stone()},
			{ new SandWater(), new SandWater(), new SandWater(), new SandWater(), new Sand(), new Sand() , new Stone(), new Grass(), new Grass(), new Stone()},
			{ new Water(), new Water(), new Water(), new SandWater(), new Sand(), new Sand() , new Stone(), new Grass(), new Grass(), new Grass()},
			{ new Water(), new Water(), new Water(), new Water(), new SandWater(), new Sand() , new Stone(), new Mud(), new Mud(), new Mud()},
			{ new Water(), new Water(), new Water(), new Water(), new Water(), new Sand() , new Stone(), new FineStone(), new FineStone(), new FineStone()}
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
		private ObjectSprite[][] objects = { 
				{ new Air(), new Air(), new Air(), new Tree(), new Tree(), new Tree() , new Tree(), new Tree(), new Tree(), new Air()},
				{ new Tree(), new Air(), new Air(), new Air(), new Tree(), new Tree() , new Tree(), new Tree(), new Tree(), new Air()},
				{ new Tree(), new Tree(), new Air(), new Air(), new Air(), new Tree() , new Tree(), new Tree(), new Tree(), new Hole()},
				{ new Tree(), new Tree(), new Sign(), new Air(), new Air(), new Air() , new Tree(), new Tree(), new Tree(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Tree(), new Tree(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Tree(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Chest() , new Air(), new Air(), new Air(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()},
				{ new Air(), new Air(), new Air(), new Air(), new Air(), new Air() , new Air(), new Air(), new Air(), new Air()}
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