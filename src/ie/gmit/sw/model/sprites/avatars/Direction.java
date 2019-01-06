package ie.gmit.sw.model.sprites.avatars;

// TODO: Auto-generated Javadoc
/**
 * The Enum Direction.
 */
public enum Direction {
	
	/** The up. */
	UP (0), 
	
	/** The down. */
	DOWN (1), 
	
	/** The left. */
	LEFT (2), 
	
	/** The right. */
	RIGHT (3);

	/** The orientation. */
	private final int orientation;

    /**
     * Instantiates a new direction.
     *
     * @param orientation the orientation
     */
    private Direction(int orientation) {
        this.orientation = orientation;
    }
    
    /**
     * Gets the orientation.
     *
     * @return the orientation
     */
    public int getOrientation() {
        return this.orientation;
    }
}