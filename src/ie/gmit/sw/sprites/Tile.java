package ie.gmit.sw.sprites;

public class Tile extends ObjectSprite {
//	Flyweight pattern: extrinsic state
	private boolean trigger;
	private int movementCost;
	
	public Tile() {
		
	}

	public boolean isTrigger() {
		return trigger;
	}

	public void setTrigger(boolean trigger) {
		this.trigger = trigger;
	}

	public int getMovementCost() {
		return movementCost;
	}

	public void setMovementCost(int movementCost) {
		this.movementCost = movementCost;
	}
	
}
