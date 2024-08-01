package com.mycompany.ch05.function;

public class Function3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int result = num(1,0,2); 
		System.out.println(result);
	}
	
	public static int num(int a,int b,int c) {
		int num1 = 0;
		if(a>b && a>c) {
			num1 = a;
		} else if(b>a && b>c) {
			num1 =b;
		} else {
			num1 =c;
		}
		return num1;
		
		
		}

	}


