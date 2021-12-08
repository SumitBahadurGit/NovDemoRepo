
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
		int i=0;
		if(input.equals("x")) {
			inp.mult(firstNum, secondNum);
			i=1;
			
			
		}
		if(input.equals("/")) {
			inp.div(firstNum, secondNum);
			i=1;
			
			
		}
		if(input.equals("+")) {
			inp.add(firstNum, secondNum);
			i=1;
			
			
		}
		if(input.equals("-")) {
			inp.sub(firstNum, secondNum);
			i=1;
			
			
		}
		if(i==0) {
			System.out.println("Wrong symbool entered. Try again!");
		}
		
		

	}
}

