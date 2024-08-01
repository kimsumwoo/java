package com.mycompany.ch05.function;

public class Function3_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num3 =num(5,7,9);
		System.out.println(num3);
	}
	public static int num(int a, int b, int c) {
		int num1 = 0;
		
		if(a>c && a>b) {
			num1 = a;
		} else if(b>a && b>c){
			num1 =b;
		} else {
			num1 =c;
		}
		return num1;
	}
	
 
}
