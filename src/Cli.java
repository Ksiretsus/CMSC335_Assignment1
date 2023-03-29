/*Program author: Ryan Miskovic
 * Date 3/24/23
 * Purpose: Class for handling user input and displaying information
 * to the console.
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Cli{

	//variables for holding user input
    private int userChoice;
    private double dim1;
    private double dim2;
    
    public Cli(){
	
		userChoice = -1;

    }

    public void welcomeMessage(){
		//Displays message on program start

		System.out.println("Welcome to the shape calculator\n"+
				   "<=============================>\n");

    }

    public void mainMenu(){
		//Displays main menu to user when called

		System.out.println("Choose a shape to calculate\n"+
				   "\n1.) Circle"+
				   "\n2.) Rectangle"+
				   "\n3.) square"+
				   "\n4.) Triangle"+
				   "\n5.) Sphere"+
				   "\n6.) Cube"+
				   "\n7.) Cone"+
				   "\n8.) Cylinder"+
				   "\n9.) Torus"+
				   "\n0.) Exit program");
    }

    public int getUserInt(){
		//Asks for user input, verifies that input is an int
		//and loops until user inputs an int.

		System.out.print("Enter choice: ");
		int choice = -1;
		while (choice < 0){
		    try {
				Scanner scanner = new Scanner(System.in);
				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Enter a positive integer: ");
			}
		}
		return choice;
	
    }

    public double getUserFloat(){
		//Asks for user input, verifies that input is an double
		//and loops until user inputs an double.

		double userDouble = -1;
		while (userDouble < 0){
		    try{Scanner scanner = new Scanner(System.in);
				userDouble = scanner.nextDouble();
			}
		    catch(InputMismatchException e){
				System.out.println("Please enter a positive number: ");
		    }
		}
		return userDouble;

    }

    public void setOneDim(String message){
		//sets the dim1 variable using getUserFloat()

		System.out.println(message);
		dim1 = getUserFloat();

    }
    
    public void setTwoDims(String message1, String message2){
		//sets the dim1 and dim2 variables using getUserFloat()

		System.out.println(message1);
		dim1 = getUserFloat();
		System.out.println(message2);
		dim2 = getUserFloat();

    }

    public int getUserChoice(){
		return userChoice;
    }

    public void setUserChoice(int userInput){
		userChoice = userInput;
    }

    public double getDim1(){
		return dim1;
    }

    public double getDim2(){
		return dim2;
    }

    public void displayArea(double area){
		System.out.println("The area is " + area + " square units");
    }

    public void displayVolume(double volume){
		System.out.println("The volume is " + volume + " cubic units");
    }

    public void displayChoice(String choice){
		System.out.println("You chose " + choice);
    }

    public void exitMessage(){
		//displays exit messange along with date & time.
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Thanks for using shape calculator!\n"+
				   "The current date & time is: " + dtf.format(current));
    }
    
}//end Cli
