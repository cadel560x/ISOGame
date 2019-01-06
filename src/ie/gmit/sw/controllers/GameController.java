package ie.gmit.sw.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.avatars.Direction;
import ie.gmit.sw.view.CartesianView;
import ie.gmit.sw.view.GameView;
import ie.gmit.sw.view.IsoView;
import ie.gmit.sw.view.ViewPainter;




// TODO: Auto-generated Javadoc
/**
 * The Class GameController.
 */
public class GameController implements KeyListener, ActionListener{
//	Data members
	/** The player. */
	private Avatar player;
	
	/** The game view. */
	private GameView gameView;
	
	/** The view painter list. */
	private List<ViewPainter> viewPainterList = new ArrayList<>();
	
	/** The timer. */
	private Timer timer; //Controls the repaint interval.
	
	/** The view painter index. */
	private int viewPainterIndex;
	
	
	
/**
 * Instantiates a new game controller.
 *
 * @param player the player
 * @param gameView the game view
 */
//	Constructors
	public GameController(Avatar player, GameView gameView) {
		this.player = player;
		this.gameView = gameView;
		
		this.viewPainterList.add(new IsoView());
		this.viewPainterList.add(new CartesianView());
		
		this.gameView.setViewPainter(viewPainterList.get(0));
		
		timer = new Timer(100, this); //calls the actionPerformed() method every 100ms
		timer.start(); //Start the timer
		
	}

	
	
	
/* (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */
//	Abstract methods implementation
	@Override
	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		gameView.actionPerformed(e);
	}

	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("right");
			player.setDirection(Direction.RIGHT);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("left");
			player.setDirection(Direction.LEFT);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("Up");
			player.setDirection(Direction.UP);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Down");
			player.setDirection(Direction.DOWN);
		} else if (e.getKeyCode() == KeyEvent.VK_Z) {
			this.toggleView();
		} else if (e.getKeyCode() == KeyEvent.VK_X) {
			System.out.println("Move");
			player.move();
		} else {
			return;
		}
		
	} // end method
	
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(KeyEvent e) {
	} // Ignore
	
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent e) {
	} // Ignore
	
	
	
	
/**
 * Toggle view.
 */
//	Other methods
	public void toggleView() {
		viewPainterIndex++;
		if (viewPainterIndex == viewPainterList.size()) {
			viewPainterIndex = 0;
		}
		
//		Strategy pattern
		gameView.setViewPainter(viewPainterList.get(viewPainterIndex));
	
	} // end method
	
} // end class
