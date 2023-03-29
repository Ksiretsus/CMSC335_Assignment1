//import java.util.Scanner;

public class Main{

    //static Scanner scanner;

    public static void main(String[] args){

	//scanner = new Scanner(System.in);
	Cli userItf = new Cli();

	userItf.welcomeMessage();
	while (userItf.getUserChoice() != 0){
	    
	    userItf.mainMenu();
	    userItf.setUserChoice(userItf.getUserInt());
	    switch (userItf.getUserChoice()) {
		
	    case 1: userItf.displayChoice("Circle");
		userItf.setOneDim("Enter radius: ");
		Circle circle = new Circle(userItf.getDim1());
		userItf.displayArea(circle.getArea());
		break;

	    
	    case 2: userItf.displayChoice("Rectangle");
		userItf.setTwoDims("Enter length: ","Enter width: ");
		Rectangle rectangle = new Rectangle(userItf.getDim1(),
						    userItf.getDim2());
		userItf.displayArea(rectangle.getArea());
		break;

	    
	    case 3: userItf.displayChoice("Square");
		userItf.setOneDim("Enter side length: ");
		Square square = new Square(userItf.getDim1());
		userItf.displayArea(square.getArea());
		break;

	    
    	    case 4: userItf.displayChoice("Triangle");
		userItf.setTwoDims("Enter base: ","Enter height: ");
		Triangle triangle = new Triangle(userItf.getDim1(),
						    userItf.getDim2());
		userItf.displayArea(triangle.getArea());
		break;

	    case 5: userItf.displayChoice("Sphere");
		userItf.setOneDim("Enter radius: ");
		Sphere sphere = new Sphere(userItf.getDim1());
		userItf.displayArea(sphere.getVolume());
		break;

	    case 6: userItf.displayChoice("Cube");
		userItf.setOneDim("Enter side length: ");
		Cube cube = new Cube(userItf.getDim1());
		userItf.displayArea(cube.getVolume());
		break;

	    case 7: userItf.displayChoice("Cone");
		userItf.setTwoDims("Enter base: ","Enter height: ");
		Cone cone = new Cone(userItf.getDim1(),
				     userItf.getDim2());
		userItf.displayArea(cone.getVolume());
		break;

	    case 8: userItf.displayChoice("Cylinder");
		userItf.setTwoDims("Enter radius: ","Enter height: ");
		Cylinder cylinder = new Cylinder(userItf.getDim1(),
						 userItf.getDim2());
		userItf.displayArea(cylinder.getVolume());
		break;

	    case 9: userItf.displayChoice("Torus");
		userItf.setTwoDims("Enter big radius: ",
				   "Enter little radius: ");
		Torus torus = new Torus(userItf.getDim1(),
				        userItf.getDim2());
		userItf.displayArea(torus.getVolume());
		break;
	    }
    

    
	}
	userItf.exitMessage();

    }

}