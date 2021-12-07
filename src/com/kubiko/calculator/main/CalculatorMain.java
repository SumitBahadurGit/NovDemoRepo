package com.kubiko.calculator.main;

import com.kubiko.calculator.main.scanner.InputReader;
import com.kubiko.calculator.printer.CustomPrinter;

public class CalculatorMain {

	public static void main(String[] args) {
		CustomPrinter customPrinter = new CustomPrinter();
		customPrinter.initialization();
		InputReader reader = new InputReader();
		int firstNum = reader.readInput("Please insert a number.");
		int secondNum = reader.readInput("Please insert another number.");
		customPrinter.print(firstNum);
		customPrinter.print(secondNum);

	}
}
