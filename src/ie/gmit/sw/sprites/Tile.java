package ie.gmit.sw.sprites;

public class Tile extends ObjectSprite {
//	Flyweight pattern: extrinsic state
//	Fields
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
	
} // end class
