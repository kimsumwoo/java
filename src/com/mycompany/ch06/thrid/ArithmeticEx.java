package com.mycompany.ch06.thrid;

public class ArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.add(3,2);
		System.out.println(result);
		
		int result2 = arithmetic.sub(4,1);
		System.out.println(result2);
		
		int result3 = arithmetic.mul(5,5);
		System.out.println(result3);
		
		int result4 = arithmetic.div(8,2);
		System.out.println(result4);
		
		int result5 = arithmetic.rem(10,5);
		System.out.println(result5);

	}

}
