package com.mycompany.ch05.function;

public class Function4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				100 이내의 자연수에서 선택된 수만큼 합산
		
		int result = num(10);
		System.out.println(result);

	}
	public static int num(int a) {
		int sum = 0;
		for(int i=1; i<=a; i++) {
			if(i<=100) {
				sum+=i;
			} else {
				sum+=i;
			}
		}
		return sum;
		
	}
}
