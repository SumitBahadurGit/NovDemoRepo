package com.kubiko.calculator.calculations;

import com.kubiko.calculator.printer.CustomPrinter;

public class InputCalc {
	CustomPrinter cus=new CustomPrinter();
	public void mult(int a,int b) {
		
		cus.print("The multiplication of two numbers "+a+" and "+b+" is "+a*b);
	}
public void div(int a,int b) {
		
		cus.print("The division of "+a+" by "+b+" is "+a/b);
	}
public void add(int a,int b) {
	
	cus.print("The addition of two numbers "+a+" and "+b+" is "+(a+b));
}
public void sub(int a,int b) {
	
	cus.print("The subtraction of  "+b+" from "+a+" is "+(b-a));
}

}
