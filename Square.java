/**
 * The Square class contains a single variable side and two constructors, one to
 * set the side to 0 and another to set the side to a particular value, as well
 * as getters and setters for side and area.
 * 
 * @author Firstene Badua
 * @version 1.0 Lab 0.2 Spring '23
 */
public class Square {
	double side;
	double area;

	/**
	 * Constructs a Square with a default side value of 0
	 */
	public Square() {
		this.side = 0;
		this.area = 0;
	}

	/**
	 * Constructs a Square with a specific side value
	 * 
	 * @param side the value of the side of the square
	 */
	public Square(double side) {
		this.side = side;
		this.area = side * side;
	}

	/**
	 * Get the value of side
	 * 
	 * @return the value of side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Set the value of side
	 * 
	 * @param side the new value of side
	 */
	public void setSide(double side) {
		this.side = side;
		this.area = side * side;
	}

	/**
	 * Get the value of area
	 * 
	 * @return the value of area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Set the value of area
	 * 
	 * @param area the new value of area
	 */
	public void setArea(double area) {
		this.area = area;
	}

}
