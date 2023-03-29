abstract class ThreeDimensionalShape extends Shape {

    private double volume;

    abstract double calculateVolume();
    
    void setVolume(){
	volume = calculateVolume();
    }

    public double getVolume(){return volume;}

}
