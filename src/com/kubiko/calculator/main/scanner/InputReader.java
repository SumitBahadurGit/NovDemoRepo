package com.kubiko.calculator.main.scanner;

import java.util.Scanner;

public class InputReader {
	
	private Scanner scanner = new Scanner(System.in);
	
	
		public int readInput(String mesz) {
			System.out.println(mesz);
			int input = scanner.nextInt();
			return input;
			
			
		}
}
