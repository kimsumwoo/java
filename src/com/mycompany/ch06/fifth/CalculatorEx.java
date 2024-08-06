package com.mycompany.ch06.fifth;

public class CalculatorEx {

	public static void main(String[] args) {
//	Calculator calculator = new Calculator();
		
		System.out.println("calculator pi :" + Calculator.pi);
		
		add(1,2);
		
		int result = Calculator.addStatic(1,2);
		System.out.println(result);
		
	}
	
	public static int add (int a, int b) {
		return a+b;
	}
	
	public static int minus (int a, int b) {
		int result2 = add(1,2);
		return a-b;
	}
	
}
