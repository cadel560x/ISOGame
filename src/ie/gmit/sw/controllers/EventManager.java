package ie.gmit.sw.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

import ie.gmit.sw.model.sprites.avatars.Avatar;
import ie.gmit.sw.model.sprites.avatars.Direction;
import ie.gmit.sw.view.GameView;

public class EventManager implements KeyListener{

	private Avatar player;
	private GameView gameView;
	
	public EventManager(Avatar player, GameView gameView) {
		this.player = player;
		this.gameView = gameView;
	}

	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		//this.repaint();
	}

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
			gameView.toggleView();
		} else if (e.getKeyCode() == KeyEvent.VK_X) {
			System.out.println("Move");
			player.move();
		} else {
			return;
		}
	}
	
	public void keyReleased(KeyEvent e) {
	} // Ignore
	
	public void keyTyped(KeyEvent e) {
	} // Ignore
}
