package com.mycompany.ch04;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 10;
		int i = 1;
		
		while(i<=10) {
			sum += i;
			System.out.println(i +": sum: " + sum);
			i++;
		}
		
		System.out.println("sum :" + sum);
	}

}
