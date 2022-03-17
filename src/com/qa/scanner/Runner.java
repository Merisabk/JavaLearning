package com.qa.scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
//		CalculatorwithScanner calculate = new CalculatorwithScanner();
//		PersonManager pm = new PersonManager();
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		boolean running = true; 
//		boolean waitingForInput = true;
//		
//		int num1 = 0;
//		int num2 = 0;
//		
//		while(running)  try {
//			waitingForInput = true;
//			System.out.println("Enter a number");
//			num1 = scanner.nextInt();
//			System.out.println("Enter another number");
//			num2 = scanner.nextInt(); } catch (InputMismatchException e){
//				System.out.println("Enter Ingeter value only");
//				waitingForInput = true;
//			}
//	
//		while(waitingForInput) {
//			System.out.println("Which method would you like to do? (add/subtract/multiply/divide)");
//			String choice = scanner.next().toLowerCase();
//			
//			switch (choice) {
//			
//			case "add": 
//				System.out.println(calculate.add(num1, num2));
//				waitingForInput = false;
//				break;
//			case "subtract": 
//				System.out.println(calculate.sub(num1, num2));
//				waitingForInput = false;
//				break;
//			case "multiply": 
//				System.out.println(calculate.mul(num1, num2));
//				waitingForInput = false;
//				break;
//			case "divide": 
//				System.out.println(calculate.div(num1, num2));
//				waitingForInput = false;
//				break;
//				default: 
//					System.out.println("You have entered an invalid operation. Try again.");
//			}
//		}
//		do {
//			System.out.println("Would you like to continue? (y/n)");
//			scanner.nextLine();
//			String choice = scanner.nextLine();
//			
//			if (choice.equalsIgnoreCase("y")) {
//				waitingForInput = false;
//			} else if (choice.equalsIgnoreCase("n")) {
//				System.out.println("Stopping the application..");
//				running = false;
//				waitingForInput = false;
//			} else {
//				System.out.println("Invalid choice");
//				waitingForInput = true;
//			} 
//			
//		} while (waitingForInput);
//		} scanner.close();
//}
//}

//		System.out.println("Enter a number");
//		int num1 = scanner.nextInt();
//		System.out.println("Enter another number");
//		int num2 = scanner.nextInt();
//		System.out.println();
//		
//		scanner.nextLine();
//		System.out.println("Which method would you like to do? (add/subtract/multiply/divide)");
//		String choice = scanner.nextLine().toLowerCase(); 
//		if (choice.equals("add")) { 
//			System.out.print("sum = ");
//			System.out.println(calculate.add(num1, num2)); }
//		if (choice.equals("subtract")) {
//			System.out.println("");	
//			System.out.println(calculate.sub(num1, num2));
//			}
//		if (choice.equals("multiply")) {
//			System.out.println(calculate.mul(num1, num2));
//		} 
//		if (choice.equals("divide")) {
//			System.out.println(calculate.div(num1, num2));
//		}
		
//		scanner.nextLine();
//		System.out.println("What would you like to do? (Create person, output all people to console, search person)");
//		String menu = scanner.nextLine();
//		if (menu.equals("Create person")) {
//			System.out.println("Enter name, age and Job title:");
//			String name = scanner.next();
//			int age = scanner.nextInt();
//			String jobTitle = scanner.nextLine();
//			System.out.println("Name: " + name);
//			System.out.println("Age: " + age);
//			System.out.println("Job Title: " + jobTitle);

//		}
			
//		String name = scanner.nextLine();
//		int age = scanner.nextInt();
//		String jobTitle = scanner.nextLine();

		

	
		
//		// used to take input from the user. Scanner is a resource. 
//			Scanner scanner = new Scanner(System.in);
//			boolean flag = true;
//			
//			while (flag) {
//				
//				System.out.print("Enter a number: ");
//			Integer numberOne = scanner.nextInt();
//			
//			System.out.print("Enter another number: ");
//			Integer numberTwo = scanner.nextInt();
//			
//			System.out.print("Sum: ");
//			System.out.println(numberOne + numberTwo);
//			
//			scanner.nextLine();
//			
//			System.out.println("Would you like to continue? (y/n)");
//			String choice = scanner.nextLine();
//			if (choice.equalsIgnoreCase("y")) {
//				continue; 
//			} else if (choice.equalsIgnoreCase("n")) {
//				System.out.println("Stopped");
//				flag = false; 
//				continue; 
//			} else { System.out.println("You entered an invalid value");
//			}
//			
	}
//	
//			
////			
////			System.out.println("Enter a number: ");
////			Integer numberOne = scanner.nextInt();
////			
////			System.out.println("Enter a number: ");
////			Integer numberTwo = scanner.nextInt();
////			
////			scanner.nextLine(); // consume the leftover newline character
////			
////			System.out.println("Enter a value: ");
////			String text = scanner.nextLine();
	
////			System.out.println(numberOne + numberTwo);
////			System.out.println("Value 2 = " + text);
////			
////			
////			scanner.close(); // when we are finished with the scanner we should close it . 
	}

	
