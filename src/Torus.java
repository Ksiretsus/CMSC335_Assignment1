public class Torus extends ThreeDimensionalShape {

    private final double PI = 3.14;
    private double bigRadius;
    private double littleRadius;

    public Torus(double inBigRadius, double inLittleRadius){
	bigRadius = inBigRadius;
	littleRadius = inLittleRadius;
	setVolume();
    }

    @Override
    double calculateVolume(){
	//Torus formula: (2Pi^2 * bigRadius * littleRadius^2)
	return (2 * PI * PI * bigRadius * littleRadius * littleRadius);
    }
    
}
