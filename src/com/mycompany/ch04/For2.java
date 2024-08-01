package com.mycompany.ch04;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int i=11; i<=50; i++) {
			if(i%2 == 0) {
				sum += i;
			} else {
				
			}
		}
		System.out.println(sum);

	}

}
