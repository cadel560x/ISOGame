package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Direction;
import ie.gmit.sw.Moveable;
import ie.gmit.sw.Point;

public class Avatar extends Sprite implements Moveable{
//	Fields
	private Point position; //The current x, y position
	private Direction direction = Direction.DOWN; //The current orientation of the sprite
	private int index = 0; //The current image index.
	private BufferedImage[][] images = new BufferedImage[4][3]; //The images used in the animation
	
	
	
	
//	Constructors
	public Avatar() {
		
	}
	
	public Avatar(BufferedImage[] img) {
		loadSprites(img);
		
	}
	
	public Avatar(String name, Point p) {
		super(name);
		
		this.position = p;
		System.out.println("here");
		
	}
	
	public Avatar(String name, Point p, BufferedImage[] img) {
		this(name, p);
		loadSprites(img);
		
	}

	
	
	

//	Getters and setters
	public Point getPosition() {
		return position;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}

	public void setDirection(Direction d) {
		direction = d;
	}
	
    public Direction getDirection() {
        return this.direction;
    }
    
    public BufferedImage getImage() {
		return images[direction.getOrientation()][index];
	}
    
    
    
    
//	Implemented abstract methods
	@Override
	public void move() { //This method is suspiciously like one I've seen already....
		step(direction);
		
		switch(direction.getOrientation()) {
		case 1:
			position.setY(position.getY() + 1); //UP
			System.out.println(position.getY());
			System.out.println(direction);
			break;
		case 2:
			position.setX(position.getX() - 1); //DOWN
			System.out.println(position.getX());
			System.out.println(direction);
			break;
		case 3:
			position.setX(position.getX() + 1); //LEFT
			System.out.println(position.getX());
			System.out.println(direction);
			break;
		default:
			position.setY(position.getY() - 1); //RIGHT
			System.out.println(position.getY());
			System.out.println(direction);
			break;
		}
		
	} // end method
    
    
    
    
//	Other methods
	public BufferedImage step(Direction d) {
		
		setDirection(d);
		if (index < images[direction.getOrientation()].length - 1) {
			index++;
		}else {
			index = 0;
		}
		
		return images[d.getOrientation()][index];
		
	} // end method
	
	
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
