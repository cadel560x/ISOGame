package ie.gmit.sw.sprites;

/*
 *   
 *   BufferedImage[][]
 *   --------------------------
 *   {U0, U1, U2, U3}, =>Up
 *   {D0, D1, D2, D3}, =>Down
 *   {L0, L1, L2, L3}, =>Left
 *   {R0, R1, R2, R3}, =>Right
 * 
 */

//import java.awt.image.*;

//import ie.gmit.sw.Point;




public abstract class Sprite { //Sprite belongs in some sort of hierarchy....
//	Fields
	private String name; //The name of the sprite
	 
	
	
	
//	Constructors
	public Sprite() {
		
	}
	
//	public Sprite(String name, Point p) {
	public Sprite(String name) {
		this.name = name;
//		this.position = p;
//		System.out.println("here");
	}
	
	
	
	
//	Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public Point getPosition() {
//		return position;
//	}
	
} // end class