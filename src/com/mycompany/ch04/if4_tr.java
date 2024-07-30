package com.mycompany.ch04;

public class if4_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		int b =0;
		
		if(a>0 && b>0) {
			System.out.println("1사분면");
		}else if(a<0 && b>0) {
			System.out.println("2사분면");
		}else if(a<0 && b<0) {
			System.out.println("3사분면");
		}else if(a>0 && b<0) {
			System.out.println("4사분면");
		}else {
			System.out.println("0입력이 있습니다.");
		}
			
	}
}
