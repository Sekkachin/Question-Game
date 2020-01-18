package tuna;
import java.util.Scanner;

public class apples {
	public static void main(String [] args) {
		// inputs user input values, stores it in "temp, temp1" and sends it to (Saying) display function.
		try (Scanner input = new Scanner(System.in)) {
			tuna tunaObject = new tuna();
			System.out.println("Enter Username and ID: ");
			String temp = input.nextLine();
			String temp1 = input.nextLine();
			tunaObject.setUser(temp, temp1);
			tunaObject.saying();
			
			// pasword function (Next line after username input.)
			System.out.println("\nPlease enter password: ");
			int password = 2500;
			Scanner userInput;
			userInput = new Scanner(System.in);
			password = userInput.nextInt();
			
			// The conditional method must be looped if "true" (without infinite loop) and continue to next question in the next Conditional Method if false.
			//while (true) {
			if (password != 2500) {
					System.out.println("\n Please try again!");
			//do {
				} else {
					System.out.println("Access Granted!");
			
					// Commented lines will be altered later. 
					
					/******** System.out.println("\n Question 1!");******
					
					if () {
						System.out.println();
					} else {
						System.out.println(); */
					
					/* ****System.out.println("\n Question 2!");*****
					
					if () {
						System.out.println();
					} else {
						System.out.println(); */
					
					/* *******System.out.println("\n Question 3!");*******
					
					if () {
						System.out.println();
					} else {
						System.out.println(); */
			}
		}
	}	
}