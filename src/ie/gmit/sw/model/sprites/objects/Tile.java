package ie.gmit.sw.model.sprites.objects;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Tile.
 */
public class Tile extends ObjectSprite {
//	Flyweight pattern: extrinsic state
/** The color. */
//	Fields
	private Color color;
	
	/** The water. */
	private boolean water;
	
	/** The movement cost. */
	private int movementCost;
	
	
	
	
/**
 * Instantiates a new tile.
 */
//	Constructors
	public Tile() {
		this.water = false;
	}

	
	
	
/**
 * Checks if is water.
 *
 * @return true, if is water
 */
//	Getters and setters
	public boolean isWater() {
		return water;
	}

	/**
	 * Sets the water.
	 *
	 * @param water the new water
	 */
	public void setWater(boolean water) {
		this.water = water;
	}

	/**
	 * Gets the movement cost.
	 *
	 * @return the movement cost
	 */
	public int getMovementCost() {
		return movementCost;
	}

	/**
	 * Sets the movement cost.
	 *
	 * @param movementCost the new movement cost
	 */
	public void setMovementCost(int movementCost) {
		this.movementCost = movementCost;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
} // end class
