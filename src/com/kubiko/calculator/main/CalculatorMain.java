
package com.kubiko.calculator.main;

import com.kubiko.calculator.calculations.InputCalc;
import com.kubiko.calculator.main.scanner.InputReader;
import com.kubiko.calculator.printer.CustomPrinter;

public class CalculatorMain {

	public static void main(String[] args) {
		CustomPrinter customPrinter = new CustomPrinter();
		InputCalc inp=new InputCalc();
		customPrinter.initialization();
		InputReader reader = new InputReader();
		int firstNum = reader.readInput("\nPlease insert a number.");
		int secondNum = reader.readInput("Please insert another number.");
		
		
		String input=reader.calcSymbool("\nPlease enter:\n+ For addition\n- For subtraction\nx For multiplication\n/ For division");
		System.out.println(input);
		if(input.equals("x")) {
			inp.mult(firstNum, secondNum);
			
			
		}
		if(input.equals("/")) {
			inp.div(firstNum, secondNum);
			
			
		}
		if(input.equals("+")) {
			inp.add(firstNum, secondNum);
			
			
		}
		if(input.equals("-")) {
			inp.sub(firstNum, secondNum);
			
			
		}
		
		
		

	}
}

