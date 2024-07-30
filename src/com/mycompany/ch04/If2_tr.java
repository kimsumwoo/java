package com.mycompany.ch04;

public class If2_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 3;
		int cost = 12000;
		double sale = 0.0;
		
		if(grade==1) {
			System.out.println("일반등급 할인은" + cost*0.05 + " 원 입니다");
		}else if(grade==2) {
			System.out.println("실버등급 할인은" + cost*0.1 + " 원 입니다");
		}else if(grade==3) {
			System.out.println("골드등급 할인은" + cost*0.15 + " 원 입니다");
		}else if(grade==4) {
			System.out.println("플래티넘등급 할인은" + cost*0.2 + " 원 입니다");
		}



	}

}
