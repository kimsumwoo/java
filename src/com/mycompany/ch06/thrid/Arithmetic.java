package com.mycompany.ch06.thrid;

public class Arithmetic {
//  사칙연산 함수 생성(=,-,*,/,%)
	int sum = 0;

	public int add(int a, int b) {
		sum = a + b;
		return sum;
	}
	public int sub(int c, int d) {
		sum = c - d;
		return sum;
	}
	public int mul(int e , int f) {
		sum = e * f;
		return sum;
	}
	public int div(int g , int h) {
		sum = g / h;
		return sum;
	}
	public int rem(int j , int k) {
		sum = j % k;
		return sum;
	}

}
