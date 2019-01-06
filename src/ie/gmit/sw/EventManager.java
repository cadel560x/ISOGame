package ie.gmit.sw;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import ie.gmit.sw.sprites.Chest;
import ie.gmit.sw.sprites.Direction;
import ie.gmit.sw.sprites.Hole;
import ie.gmit.sw.sprites.ObjectSprite;
import ie.gmit.sw.sprites.PlayerSprite;
import ie.gmit.sw.sprites.Sign;
import ie.gmit.sw.sprites.SpriteFactory;

public class EventManager implements KeyListener {

	private PlayerSprite player;
	private ObjectSprite[][] objects;

	public EventManager(PlayerSprite player, ObjectSprite[][] objects) {
		this.player = player;
		this.objects = objects;
	}

//	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
////		this.repaint();
//	}
//	
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
			GameView view = GameView.getInstance();
			view.toggleView();
		} else if (e.getKeyCode() == KeyEvent.VK_X) {
			System.out.println("Move");
			player.move();
		} else if (e.getKeyCode() == KeyEvent.VK_C) {

			System.out.println("Collect");

			// Player has landed on chest grid
			if (objects[player.getPosition().getY()][+player.getPosition().getX()] instanceof Chest) {
				// MenuDialogs.showInfo("Player collected chest :" +
				// (player.getChestsCollected() + 1) + "/3", "Game Progress ");
				player.setChestsCollected(player.getChestsCollected() + 1);
				// remove chest from game
				try {
					objects[player.getPosition().getY()][+player.getPosition().getX()] = SpriteFactory.airInstance();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(objects[player.getPosition().getY()][+player.getPosition().getX()] instanceof Sign) {
				System.out.println("Sign interacted with");
				JOptionPane.showMessageDialog(null,"The aim of the game is to collect the checks and fall down the hole, Game Instructions", "Game Complete" , JOptionPane.INFORMATION_MESSAGE);
			}

			// If player presses C while on hole and all chests collected if
			else if (objects[player.getPosition().getY()][player.getPosition().getX()] instanceof Hole) {
				if(player.getChestsCollected() == 1) {
					player.setEndPointActivated(true);
					System.out.println("END");
					JOptionPane.showMessageDialog(null,"Congrats, GAME COMPLETE", "Game Complete" , JOptionPane.INFORMATION_MESSAGE);
				}
			}

		} else {
			return;
		}
	}

	public void keyReleased(KeyEvent e) {
	} // Ignore

	public void keyTyped(KeyEvent e) {
	} // Ignore
}
