package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size, Color color) {
		//FIXME
		this.x = x;
		this.y = y;
		this.color = color;
		this.size = size;		
		
		//See ColorUtils for some color options (or choose your own)
	}
	
	public double getX() {
		return this.x;
	}
	
	
	public double getY() {
		return this.y;
	}
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledCircle(this.x, this.y, this.size);
		
	}
	
}
