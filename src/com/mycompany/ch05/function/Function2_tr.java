package com.mycompany.ch05.function;

public class Function2_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num2 =num(3);
		System.out.println(num2);
	}
	public static String num(int num1) {
		String result = "";
		if(num1 %2 ==1) {
			result = "홀수";
		}else {
			result = "짝수";
		}
		return result;
	}
}
