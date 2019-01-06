package ie.gmit.sw.sprites.objects;

import java.awt.Color;

public class Tile extends ObjectSprite {
//	Flyweight pattern: extrinsic state
//	Fields
	private Color color;
	private boolean water;
	private int movementCost;
	
	
	
	
//	Constructors
	public Tile() {
		
	}

	
	
	
//	Getters and setters
	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public int getMovementCost() {
		return movementCost;
	}

	public void setMovementCost(int movementCost) {
		this.movementCost = movementCost;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
} // end class
