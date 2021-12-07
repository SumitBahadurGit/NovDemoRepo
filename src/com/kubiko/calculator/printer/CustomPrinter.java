
package com.kubiko.calculator.printer;

import com.kubiko.calculator.constant.CalculatorConstant;

public class CustomPrinter {

	public void print(String p) {
		System.out.println(p);
	}

	public void print(int num) {
		System.out.println(num);
	}

	public void initialization() {
		CalculatorConstant calculatorConstant = new CalculatorConstant();

		int[] temp = calculatorConstant.allNumbers;
		for (int j = 0; j <= temp.length - 1; j++) {
			System.out.print(temp[j]);
			System.out.print("   ");
			if (temp[j] % 3 == 0 && temp[j] != 0) {
				System.out.println();
			}
		}
		System.out.print(calculatorConstant.add);
		System.out.print("   ");
		System.out.print(calculatorConstant.multiply);
		System.out.println();
		System.out.print(calculatorConstant.div);
		System.out.print("   ");
		System.out.print(calculatorConstant.sub);

	}

}

