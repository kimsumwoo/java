package com.mycompany.ch04;

public class If5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		int c = 3;
		
		if(a>b && a>c && b<c) {
			System.out.println("최대값은 a :" + a);
			System.out.println("최소값은 b :" + b);
		} else if(a>b && a>c && c<b){
			System.out.println("최대값은 a : " + a);
			System.out.println("최소값은 c : " + c);
		} else if(b>a && b>c && c<a){
			System.out.println("최대값은 b : " + b);
			System.out.println("최소값은 c : " + c);
		} else if(b>a && b>c && a<c){
			System.out.println("최대값은 b : " + b);
			System.out.println("최소값은 a : " + a);
		} else if(c>a && c>b && b<a){
			System.out.println("최대값은 c : " + c);
			System.out.println("최소값은 b : " + b);
		} else if(c>a && c>b && a<b){
			System.out.println("최대값은 c : " + c);
			System.out.println("최소값은 a : " + a);
		} else {
			System.out.println("같은수가 있음");
		}
		
//		if(a != b && b != c && c != a) {
//			if(a > b && a > c) {
//				System.out.println("최대값은 : " + a);
//			} else if (b > a && b > c) {
//				System.out.println("최대값은 : " + b);
//			} else {
//				System.out.println("최대값은 : " + c);
//			}
//			
//			if(a < b && a < c) {
//				System.out.println("최소값은 : " + a);
//			} else if ( b < a && b < c ) {
//				System.out.println("최소값은 : " + b);
//			} else {
//				System.out.println("최소값은 : " + c);
//			}
//		} else {
//			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
//		}
		
	}

}
