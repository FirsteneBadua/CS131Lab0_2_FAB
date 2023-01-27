/**
 * The Application class contains the main method and creates an instance of ArrayFun
 * and uses its methods to manipulate and print out information about the Square objects
 * stored in the ArrayFun's myArray field.
 * 
 * @author Your Name
 * @version 1.0
 * Lab 0.2
 * Spring '23
 */
public class Application {
    public static void main(String[] args) {
        ArrayFun arrayFun = new ArrayFun();
        
        // Print out areas of squares in the array using forward() method
        arrayFun.forward();
        
        // Print out areas of squares in the array using backward() method
        arrayFun.backward();
        
        // Print out sum of areas of squares in the array using sum() method
        arrayFun.sum();
    }
}
