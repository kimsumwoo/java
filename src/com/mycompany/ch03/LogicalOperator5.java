package com.mycompany.ch03;

public class LogicalOperator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		논리연산자(&,&&,|,||,^)
		
		int a =65;
		
		if(a >= 65 && a<= 70) {
			System.out.println("&&: true");
		}
		
		if(a >= 65 & a<= 70) {
			System.out.println("&: true");
		}
		
		if(a > 65 || a<= 70) {
			System.out.println("||: true");
		}
		
		if(a > 65 | a<= 70) {
			System.out.println("|: true");
		}
		
		if(a > 65 ^ a<= 70) {
			System.out.println("^1: true");
		}

		
	}

}
