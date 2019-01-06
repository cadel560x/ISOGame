package ie.gmit.sw.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

//import javax.swing.JPanel;
import javax.swing.Timer;

import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.avatars.Direction;
import ie.gmit.sw.view.CartesianView;
import ie.gmit.sw.view.GameView;
import ie.gmit.sw.view.IsoView;
//import ie.gmit.sw.view.IsoView;
import ie.gmit.sw.view.ViewPainter;

public class EventManager implements KeyListener, ActionListener{
//	Data members
	private Avatar player;
	private GameView gameView;
	private List<ViewPainter> viewPainterList = new ArrayList<>();
	private Timer timer; //Controls the repaint interval.
	
	private int viewPainterIndex;
	
	
	
//	Constructors
	public EventManager(Avatar player, GameView gameView) {
		this.player = player;
		this.gameView = gameView;
		
		this.viewPainterList.add(new IsoView());
		this.viewPainterList.add(new CartesianView());
		
		this.gameView.setViewPainter(viewPainterList.get(0));
		
		timer = new Timer(100, this); //calls the actionPerformed() method every 100ms
		timer.start(); //Start the timer
		
	}

	
	
	
//	Abstract methods implementation
	@Override
	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		//this.repaint();
		gameView.actionPerformed(e);
	}

	
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
//			gameView.toggleView();
			this.toggleView();
		} else if (e.getKeyCode() == KeyEvent.VK_X) {
			System.out.println("Move");
			player.move();
		} else {
			return;
		}
		
	} // end method
	
	
	public void keyReleased(KeyEvent e) {
	} // Ignore
	
	public void keyTyped(KeyEvent e) {
	} // Ignore
	
	
	
	
//	Other methods
	public void toggleView() {
//		isIsometric = !isIsometric;
//		this.repaint();
		
		viewPainterIndex++;
		if (viewPainterIndex == viewPainterList.size()) {
			viewPainterIndex = 0;
		}
		
		gameView.setViewPainter(viewPainterList.get(viewPainterIndex));
	
	} // end method
	
} // end class
