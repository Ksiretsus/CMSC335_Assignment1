public class Cube extends ThreeDimensionalShape {

    private double sideLength;

    public Cube(double inSideLength){
	sideLength = inSideLength;
	setVolume();
    }

    @Override
    double calculateVolume(){
	return (sideLength * sideLength * sideLength);
    }
    
}
