package ie.gmit.sw.model.sprites;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 */
public abstract class Sprite {
	 //	Fields
	/** The name. */
	private String name;
	 
	
	
	//	Constructors
	/**
	 * Instantiates a new sprite.
	 */
	public Sprite() {
		
	}
	
	/**
	 * Instantiates a new sprite.
	 *
	 * @param name the name
	 */
	public Sprite(String name) {
		this.name = name;
	}
	
	
	

//	Getters and setters
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
} // end class