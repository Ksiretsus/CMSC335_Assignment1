/*Program author: Ryan Miskovic
 * Date: 3/24/23
 * Program purpose: Calculate the area or volume of various geometric
 * shapes using dimensions input by the user.
 */
public class Main{


    public static void main(String[] args){

	Cli userItf = new Cli();  //Initializes the Command line interface object

	userItf.welcomeMessage();

	while (userItf.getUserChoice() != 0){ //loop until user exits the program
	    
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
				userItf.displayVolume(sphere.getVolume());
				break;

	    case 6: userItf.displayChoice("Cube");
				userItf.setOneDim("Enter side length: ");
				Cube cube = new Cube(userItf.getDim1());
				userItf.displayVolume(cube.getVolume());
				break;

	    case 7: userItf.displayChoice("Cone");
				userItf.setTwoDims("Enter base: ","Enter height: ");
				Cone cone = new Cone(userItf.getDim1(),
						     		userItf.getDim2());
				userItf.displayVolume(cone.getVolume());
				break;

	    case 8: userItf.displayChoice("Cylinder");
				userItf.setTwoDims("Enter radius: ","Enter height: ");
				Cylinder cylinder = new Cylinder(userItf.getDim1(),
								 				userItf.getDim2());
				userItf.displayVolume(cylinder.getVolume());
		break;

	    case 9: userItf.displayChoice("Torus");
				userItf.setTwoDims("Enter big radius: ",
						  		 "Enter little radius: ");
				Torus torus = new Torus(userItf.getDim1(),
						        	userItf.getDim2());
				userItf.displayVolume(torus.getVolume());
				break;
	    }//end switch
    

    
	}//end while
	userItf.exitMessage();

    }

}//end Main
