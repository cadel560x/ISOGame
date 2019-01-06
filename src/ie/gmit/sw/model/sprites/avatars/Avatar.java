package ie.gmit.sw.model.sprites.avatars;

import java.awt.image.BufferedImage;

import ie.gmit.sw.model.sprites.Point;
import ie.gmit.sw.model.sprites.Sprite;
import ie.gmit.sw.model.sprites.objects.ObjectSprite;




// TODO: Auto-generated Javadoc
/**
 * The Class Avatar.
 */
public class Avatar extends Sprite {

/** The health points. */
//	Fields
	private int healthPoints = 100;
	/** The position. */
	private Point position; //The current x, y position
	
	/** The direction. */
	private Direction direction = Direction.DOWN; //The current orientation of the sprite
	
	/** The index. */
	private int index = 0; //The current image index.
	
	/** The images. */
	private BufferedImage[][] images = new BufferedImage[4][3]; //The images used in the animation
	
	/** The matrix. */
	private ObjectSprite[][] matrix;
	
	
	
	
/**
 * Instantiates a new avatar.
 */
//	Constructors
	public Avatar() {
		
	}
	
	/**
	 * Instantiates a new avatar.
	 *
	 * @param img the img
	 */
	public Avatar(BufferedImage[] img) {
		loadSprites(img);
		
	}
	
	/**
	 * Instantiates a new avatar.
	 *
	 * @param name the name
	 * @param p the p
	 */
	public Avatar(String name, Point p) {
		super(name);
		
		this.position = p;
		System.out.println("here");
		
	}
	
	/**
	 * Instantiates a new avatar.
	 *
	 * @param name the name
	 * @param p the p
	 * @param img the img
	 */
	public Avatar(String name, Point p, BufferedImage[] img) {
		this(name, p);
		loadSprites(img);
		
	}

	
	
	

//	Getters and setters
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}
	
	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	/**
	 * Sets the direction.
	 *
	 * @param d the new direction
	 */
	public void setDirection(Direction d) {
		direction = d;
	}
	
    /**
     * Gets the direction.
     *
     * @return the direction
     */
    public Direction getDirection() {
        return this.direction;
    }
    
    /**
     * Gets the image.
     *
     * @return the image
     */
    public BufferedImage getImage() {
		return images[direction.getOrientation()][index];
	}
    
    /**
     * Gets the matrix.
     *
     * @return the matrix
     */
    public ObjectSprite[][] getMatrix() {
		return matrix;
	}

	/**
	 * Sets the matrix.
	 *
	 * @param matrix the new matrix
	 */
	public void setMatrix(ObjectSprite[][] matrix) {
		this.matrix = matrix;
	}

	
	/**
	 * Gets the health points.
	 *
	 * @return the health points
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * Sets the health points.
	 *
	 * @param healthPoints the new health points
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	
	

//	Implemented abstract methods
	/**
	 * Move.
	 */
	public void move() {
		step(direction);
		
		int maxRow = matrix.length;
		int maxCol = matrix[0].length;
		int nextX;
		int nextY;
		
		switch(direction.getOrientation()) {
		case 1:
			nextY = position.getY() + 1;
			
			if ( (-1 < nextY && nextY < maxCol)) {
				position.setY(nextY); //UP
				System.out.println(position.getY());
				System.out.println(direction);
			}
			break;
		case 2:
			nextX = position.getX() - 1;
			
			if ( -1 < nextX &&  nextX < maxRow) {
				position.setX(nextX); //DOWN
				System.out.println(nextX);
				System.out.println(direction);
			}
			break;
		case 3:
			nextX = position.getX() + 1;
			
			if ( -1 < nextX && nextX < maxRow) {
				position.setX(nextX); //LEFT
				System.out.println(position.getX());
				System.out.println(direction);
			}
			break;
		default:
			nextY = position.getY() - 1;
			
			
			if ( -1 < nextY && nextY < maxCol) {
				position.setY(nextY); //RIGHT
				System.out.println(position.getY());
				System.out.println(direction);
			}
			break;
		}
		
	} // end method
    
    
    
    
//	Other methods
	/**
	 * Step.
	 *
	 * @param d the d
	 * @return the buffered image
	 */
	public BufferedImage step(Direction d) {
		
		setDirection(d);
		if (index < images[direction.getOrientation()].length - 1) {
			index++;
		}else {
			index = 0;
		}
		
		return images[d.getOrientation()][index];
		
	} // end method
	
	
	/**
	 * Load sprites.
	 *
	 * @param img the img
	 */
	public void loadSprites(BufferedImage[] img) {
		int row = 0, col = 0;
		for (int i = 0; i < img.length; i++) {
			images[row][col] = img[i];
			if (col == images[row].length - 1) {
				row++;
				col = 0;
			} else {
				col++;
			}
			
		} // end loop

	} // end method
	
} // end class
