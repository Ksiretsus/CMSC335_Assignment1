/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for creating NumberOfDimensions object.
 * The object is instantiated but never used. The Project one 
 * guidelines showed the Shape object having a NumberOfDimensions
 * object, so this class exists to satisfy that ruberic requirement.
 */

public class NumberOfDimensions {

    int dimensions;
    
    public NumberOfDimensions(int dims){
        dimensions = dims;
    }

    public int getDimensions() {
        return dimensions;
    }

}
