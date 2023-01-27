import java.util.Arrays;

/**
 * The ArrayFun class contains an array of Square objects and methods to
 * manipulate and access the array.
 * 
 * @author Firstene Badua
 * @version 1.0 Lab 0.1 Spring '23
 */
public class ArrayFun {
	Square[] myArray;

	/**
	 * Creates an array of Square objects with a side length of 0 to 5.
	 */
	public ArrayFun() {
		myArray = new Square[6];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = new Square(i);
		}
	}

	/**
	 * Sets a Square object at a specific index in the array.
	 * 
	 * @param index the index in the array to set the Square object
	 * @param s     the Square object to set in the array
	 */
	public void setArrayItem(int index, Square s) {
		myArray[index] = s;
	}

	/**
	 * Gets a Square object at a specific index in the array.
	 * 
	 * @param index the index in the array to get the Square object
	 * @return the Square object at the specified index in the array
	 */
	public Square getArrayItem(int index) {
		return myArray[index];
	}

	/**
	 * Prints the area of each Square object in the array in the order they appear
	 * in the array.
	 */
	public void forward() {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Square " + i + " area: " + myArray[i].getArea());
		}
	}

	/**
	 * Prints the area of each Square object in the array in reverse order of they
	 * appear in the array.
	 */
	public void backward() {
		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println("Square " + i + " area: " + myArray[i].getArea());
		}
	}

	/**
	 * Prints the total area of all Square objects in the array.
	 */
	public void sum() {
		double totalArea = 0;
		for (int i = 0; i < myArray.length; i++) {
			totalArea += myArray[i].getArea();
		}
		System.out.println("Total area of all squares: " + totalArea);
	}
}
