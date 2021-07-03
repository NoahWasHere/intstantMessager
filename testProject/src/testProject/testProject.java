package testProject;

import java.util.Scanner;

public class testProject {

	public static void main(String[] args) {
		
		//Take user input with a new scanner.
		Scanner scan = new Scanner(System.in);
		
		//Ask for a username and password then, check to see if it checks out with switch.
		System.out.println("Please enter a username.");
		String username = scan.next();
		
		System.out.println("Please enter your password.");
		String password = scan.next();
		
		passwordChecker(username, password);
	}
	
	public static void passwordChecker(String username, String password) {
		switch(password) {
		case "password1":
			System.out.println("Welcome, @" + username + " !");
			mainProgram(username);
			break;
		case "dadis_cool21":
			System.out.println("Welcome, @" + username + " !");
			mainProgram(username);
			break;
		default:
			System.out.println("Incorrect password. Please restart the program to try again.");
			break;	
		}
		
	}
	
	public static void mainProgram(String username) {
		Scanner enterMessage = new Scanner(System.in);
		while(true) {
			System.out.println("Bot: This is an automated message.");
			String userMessage = enterMessage.nextLine();
			System.out.println(username + ": " + userMessage);
		}
	}
	
}
	

