//Basic Calculator App
//Functions include: Addition, Subtraction, Multiplication, Division and Modulus
//Created by D'Angelo Walker
//Version 1.0

package basic_calculator;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {

		//This is the Menu in main which prompts the user's option to take them to the associated Calculator function
	
		int option; //The user's menu choice is stored as an int in this variable
		
		Scanner key=new Scanner(System.in); //A new Scanner object is created to capture the user's input
		
		//Here is what is shown at the Menu screen; These are the Calculator's functions
		System.out.println("\t\t\t\t\t\t\t*-+/%Basic Calculator%/+-*\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Menu\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n\n\n");
		System.out.println("Please choose your option by entering the associated number:\t");
		option=key.nextInt();
		
		//Nested if statements were used to match the user's input and take them to the requested Calculator function
		if(option == 1){
			Add(); //The Addition function is called here if the user's input is 1
		}if(option == 2) {
			Subtract(); //The Subtraction function is called here if the user's input is 2
		}if(option == 3) {
			Multiply(); //The Multiplication function is called here if the user's input is 3
		}if(option == 4) {
			Divide(); //The Division function is called here if the user's input is 4
		}if(option == 5){
			Mod(); //The Modulus function is called here if the user's input is 5
		}else {System.out.println("Your option is invalid! Session Terminated!!");}
		
    key.close();//Closes the Scanner object
	System.exit(0);//Exits the system when the Nested if is exited
	}

	public static void Add(){

		//The Addition function captures two values from the user, and both values are stored as a double
		//The result is represented to the user as a decimal with two decimal spaces from the point
		
		double a;
		double b;
		int choice; //This choice variable measures the user's option to either return to Menu or to exit the Calculator

		Scanner ui=new Scanner(System.in); //Scanner object created to capture user's input for the two values and used to capture their choice
		
		//Here the user is prompted to enter their values and shown their result
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t\t****Addition****\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Please enter your first number: \t");
		a=ui.nextDouble();
		System.out.println("\n\nPlease enter your second number: \t");
		b=ui.nextDouble();
		double add=a+b;

		if(a < 10 & b < 10 & add < 10){ //print out when two single values are entered and given a single result
		System.out.printf("\n\nYour result is:\n\n  %.2f", a);
		System.out.printf("\n+ %.2f", b);
		System.out.println("\n--------");
		System.out.printf("  %.2f", add);
		System.out.println("\n\n");
		}else if(a < 10 & b < 10 & add >= 10 & add < 19){ //print out when two single values are entered and given a double digit result
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n+ %.2f", b);
			System.out.println("\n--------");
			System.out.printf(" %.2f", add);
			System.out.println("\n\n");
		}else if(a >= 10 & a < 100 & b < 10 & add < 100){ //print out when "a" is double digit and "b" is single digit
		System.out.printf("\n\nYour result is:\n\n  %.2f", a);
		System.out.printf("\n+  %.2f", b);
		System.out.println("\n--------");
		System.out.printf("  %.2f", add);
		System.out.println("\n\n");
		}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & add < 100){ //print out when "a", "b" and "add" are double digits
		System.out.printf("\n\nYour result is:\n\n  %.2f", a);
		System.out.printf("\n+ %.2f", b);
		System.out.println("\n--------");
		System.out.printf("  %.2f", add);
		System.out.println("\n\n");
			}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & add > 99 & add < 200){ //print out when "a" and "b" are double digits and "add" is triple digit
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\n+ %.2f", b);
				System.out.println("\n--------");
				System.out.printf(" %.2f", add);
				System.out.println("\n\n");
			}else if(a >= 100 & b < 10){ //print out when "a" is triple digit and "b" is single digit
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n+   %.2f", b);
			System.out.println("\n---------");
			System.out.printf("  %.2f", add);
			System.out.println("\n\n");
			}else if(a >= 100 & b > 10 & b < 100){ //print out when "a" is triple digit and "b" is double digit
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\n+  %.2f", b);
				System.out.println("\n---------");
				System.out.printf("  %.2f", add);
				System.out.println("\n\n");
			}
		else{ //print out of other results
		System.out.printf("\n\nYour result is:\n\n  %.2f", a);
		System.out.printf("\n+ %.2f", b);
		System.out.println("\n-----------");
		System.out.printf("  %.2f", add);
		System.out.println("\n\n");
	}
		PauseFunction();//This function was created to add a pause effect to the program and waits on a key stroke to continue to the next step

		System.out.println("\n\nPress 1 to return to Menu, Press 2 to exit"); //User requested to return to Menu or abort App
		choice=ui.nextInt();
		
		//Nested if to measure user's choice and provide their request
		if(choice == 1) {
			main(null);
		}if(choice == 2) {
			System.out.println("\n\n\n\t\t\t\t\t\t\tClosed Successfully!!!");
			System.exit(0); //Aborts the App
		}else {System.out.println("!!!!!!!!!!!!!!!!!!SESSION TERMINATED!!!!!!!!!!!!!!!!!!");
			System.exit(0); //App will also be aborted if the choice does not match what is presented
		}
	}

	public static void Subtract(){

		//The Subtraction function captures two values from the user, and both values are stored as a double
		//The result is represented to the user as a decimal with two decimal spaces from the point

		double a;
		double b;
		int choice;//This choice variable measures the user's option to either return to Menu or to exit the Calculator

		Scanner ui=new Scanner(System.in);//Scanner object created to capture user's input for the two values and used to capture their choice
		
		//Here the user is prompted to enter their values and shown their result
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t\t****Subtraction****\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Please enter your first number: \t");
		a=ui.nextDouble();
		System.out.println("\n\nPlease enter your second number: \t");
		b=ui.nextDouble();
		double sub=a-b;
		if(a < 10 & b < 10 & sub < 10){ //print out when two single values are entered and given a single result
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n- %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", sub);
			System.out.println("\n\n");
			}else if(a < 10 & b < 10 & sub >= 10 & sub < 19){ //print out when two single values are entered and given a double digit result
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\n- %.2f", b);
				System.out.println("\n--------");
				System.out.printf(" %.2f", sub);
				System.out.println("\n\n");
			}else if(a >= 10 & a < 100 & b < 10 & sub < 100){ //print out when "a" is double digit and "b" is single digit
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n-  %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", sub);
			System.out.println("\n\n");
			}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & sub < 100){ //print out when "a", "b" and "sub" are double digits
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n- %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", sub);
			System.out.println("\n\n");
				}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & sub > 99 & sub < 200){ //print out when "a" and "b" are double digits and "sub" is triple digit
					System.out.printf("\n\nYour result is:\n\n  %.2f", a);
					System.out.printf("\n- %.2f", b);
					System.out.println("\n--------");
					System.out.printf(" %.2f", sub);
					System.out.println("\n\n");
				}else if(a >= 100 & b < 10){ //print out when "a" is triple digit and "b" is single digit
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\n-   %.2f", b);
				System.out.println("\n---------");
				System.out.printf("  %.2f", sub);
				System.out.println("\n\n");
				}else if(a >= 100 & b > 10 & b < 100){ //print out when "a" is triple digit and "b" is double digit
					System.out.printf("\n\nYour result is:\n\n  %.2f", a);
					System.out.printf("\n-  %.2f", b);
					System.out.println("\n---------");
					System.out.printf("  %.2f", sub);
					System.out.println("\n\n");
				}
			else{ //print out of other results
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\n- %.2f", b);
			System.out.println("\n-----------");
			System.out.printf("  %.2f", sub);
			System.out.println("\n\n");
		}
		PauseFunction();//This function was created to add a pause effect to the program and waits on a key stroke to continue to the next step

		System.out.println("\n\nPress 1 to return to Menu, Press 2 to exit");//User requested to return to Menu or abort App
		choice=ui.nextInt();

		//Nested if to measure user's choice and provide their request
		if(choice == 1) {
			main(null);
		}if(choice == 2) {
			System.out.println("\n\n\n\t\t\t\t\t\t\tClosed Successfully!!!");
			System.exit(0);//Aborts the App
		}else {System.out.println("!!!!!!!!!!!!!!!!!!SESSION TERMINATED!!!!!!!!!!!!!!!!!!");
			System.exit(0);//App will also be aborted if the choice does not match what is presented
		}
	}
	
	public static void Multiply() {

		//The Multiplication function captures two values from the user, and both values are stored as a double
		//The result is represented to the user as a decimal with two decimal spaces from the point

		double a;
		double b;
		int choice;//This choice variable measures the user's option to either return to Menu or to exit the Calculator

		Scanner ui=new Scanner(System.in);//Scanner object created to capture user's input for the two values and used to capture their choice
		
		//Here the user is prompted to enter their values and shown their result
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t\t****Multiplication****\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Please enter your first number: \t");
		a=ui.nextDouble();
		System.out.println("\n\nPlease enter your second number: \t");
		b=ui.nextDouble();
		double mult=a*b;

		if(a < 10 & b < 10 & mult < 10){ //print out when two single values are entered and given a single result
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\nx %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", mult);
			System.out.println("\n\n");
			}else if(a < 10 & b < 10 & mult >= 10 & mult < 19){ //print out when two single values are entered and given a double digit result
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\nx %.2f", b);
				System.out.println("\n--------");
				System.out.printf(" %.2f", mult);
				System.out.println("\n\n");
			}else if(a >= 10 & a < 100 & b < 10 & mult < 100){ //print out when "a" is double digit and "b" is single digit
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\nx  %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", mult);
			System.out.println("\n\n");
			}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & mult < 100){ //print out when "a", "b" and "mult" are double digits
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\nx %.2f", b);
			System.out.println("\n--------");
			System.out.printf("  %.2f", mult);
			System.out.println("\n\n");
				}else if(a >= 10 & a < 100 & b >= 10 & b < 100 & mult > 99 & mult < 200){ //print out when "a" and "b" are double digits and "mult" is triple digit
					System.out.printf("\n\nYour result is:\n\n  %.2f", a);
					System.out.printf("\nx %.2f", b);
					System.out.println("\n--------");
					System.out.printf(" %.2f", mult);
					System.out.println("\n\n");
				}else if(a >= 100 & b < 10){ //print out when "a" is triple digit and "b" is single digit
				System.out.printf("\n\nYour result is:\n\n  %.2f", a);
				System.out.printf("\nx   %.2f", b);
				System.out.println("\n---------");
				System.out.printf("  %.2f", mult);
				System.out.println("\n\n");
				}else if(a >= 100 & b > 10 & b < 100){ //print out when "a" is triple digit and "b" is double digit
					System.out.printf("\n\nYour result is:\n\n  %.2f", a);
					System.out.printf("\nx  %.2f", b);
					System.out.println("\n---------");
					System.out.printf("  %.2f", mult);
					System.out.println("\n\n");
				}
			else{ //print out of other results
			System.out.printf("\n\nYour result is:\n\n  %.2f", a);
			System.out.printf("\nx %.2f", b);
			System.out.println("\n-----------");
			System.out.printf("  %.2f", mult);
			System.out.println("\n\n");
		}
		PauseFunction();//This function was created to add a pause effect to the program and waits on a key stroke to continue to the next step

		System.out.println("\n\nPress 1 to return to Menu, Press 2 to exit");//User requested to return to Menu or abort App
		choice=ui.nextInt();

		//Nested if to measure user's choice and provide their request
		if(choice == 1) {
			main(null);
		}if(choice == 2) {
			System.out.println("\n\n\n\t\t\t\t\t\t\tClosed Successfully!!!");
			System.exit(0);//Aborts the App
		}else {System.out.println("!!!!!!!!!!!!!!!!!!SESSION TERMINATED!!!!!!!!!!!!!!!!!!");
			System.exit(0);//App will also be aborted if the choice does not match what is presented
		}

	}

	public static void Divide() {

		//The Division function captures two values from the user, and both values are stored as a double
		//The result is represented to the user as a decimal with two decimal spaces from the point

		double a;
		double b;
		int choice;//This choice variable measures the user's option to either return to Menu or to exit the Calculator

		Scanner ui=new Scanner(System.in);//Scanner object created to capture user's input for the two values and used to capture their choice
		
		//Here the user is prompted to enter their values and shown their result
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t\t****Division****\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Please enter your first number: \t");
		a=ui.nextDouble();
		System.out.println("\n\nPlease enter your second number: \t");
		b=ui.nextDouble();
		double div=a/b;
		System.out.printf("\n\nYour result is:\n\n  %.2f / %.2f = %.2f", a, b, div);
		System.out.println("\n\n");
		PauseFunction();//This function was created to add a pause effect to the program and waits on a key stroke to continue to the next step

		System.out.println("\n\nPress 1 to return to Menu, Press 2 to exit");//User requested to return to Menu or abort App
		choice=ui.nextInt();

		//Nested if to measure user's choice and provide their request
		if(choice == 1) {
			main(null);
		}if(choice == 2) {
			System.out.println("\n\n\n\t\t\t\t\t\t\tClosed Successfully!!!");
			System.exit(0);//Aborts the App
		}else {System.out.println("!!!!!!!!!!!!!!!!!!SESSION TERMINATED!!!!!!!!!!!!!!!!!!");
			System.exit(0);
		}
	}

	public static void Mod() {

		//The Modulus function captures two values from the user, and both values are stored as an int
		//The result is represented to the user as a single digit (remainder of a division)

		int a;
		int b;
		int choice;//This choice variable measures the user's option to either return to Menu or to exit the Calculator

		Scanner ui=new Scanner(System.in);//Scanner object created to capture user's input for the two values and used to capture their choice
		
		//Here the user is prompted to enter their values and shown their result
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t\t\t\t\t\t****Modulus****\n\n Created by: D'Angelo Walker\n\n");
		System.out.println("Please enter your first number: \t");
		a=ui.nextInt();
		System.out.println("\n\nPlease enter your second number: \t");
		b=ui.nextInt();
		int mod=a%b;
		System.out.printf("\n\nYour result is:\n\n  %d mod %d  = %d", a, b, mod);
		System.out.println("\n\n");
		PauseFunction();//This function was created to add a pause effect to the program and waits on a key stroke to continue to the next step

		System.out.println("\n\nPress 1 to return to Menu, Press 2 to exit");//User requested to return to Menu or abort App
		choice=ui.nextInt();

		//Nested if to measure user's choice and provide their request
		if(choice == 1) {
			main(null);
		}if(choice == 2) {
			System.out.println("\n\n\n\t\t\t\t\t\t\tClosed Successfully!!!");
			System.exit(0);//Aborts the App
		}else {System.out.println("!!!!!!!!!!!!!!!!!!SESSION TERMINATED!!!!!!!!!!!!!!!!!!");
			System.exit(0);//App will also be aborted if the choice does not match what is presented
		}
	}


	public static void PauseFunction(){//Pause function: When called, gives a pausing effect such as system("pause") in C++

		System.out.println("Press Any Key To Continue...");
          new java.util.Scanner(System.in).nextLine();//User required to enter a key stroke on the keyboard to continue in the App
	}

}
