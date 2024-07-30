package com.mycompany.ch04;

public class if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5%
//		10%
//		15%
//		20%
//		27%
		int grade = 5;
		int cost = 12000;
		
		double salecost = 0.27;
		
		
		if(grade==1) {
			System.out.println("정가가12000원인 일반등급의 할인가는"+ cost * salecost + "원입니다");
		} else if(grade==2){
			System.out.println("정가가12000원인 브론즈등급의 할인가는"+ cost * salecost + "원입니다");
		} else if(grade==3){
			System.out.println("정가가12000원인 실버등급의 할인가는"+ cost * salecost + "원입니다");
		} else if(grade==4){
			System.out.println("정가가12000원인 골드등급의 할인가는"+ cost * salecost + "원입니다");
		} else if(grade==5){
			System.out.println("정가가12000원인 플래티넘등급의 할인가는"+ cost * salecost + "원입니다");
		} else {
			System.out.println("올바른 문구를 입력하세요");
		}
		
		
//		if(grade == 1) {
//			salesCost = cost * (1-0.05);
//			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 2) {
//			salesCost = cost * (1-0.1);
//			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 3) {
//			salesCost = cost * (1-0.15);
//			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 4) {
//			salesCost = cost * (1-0.2);
//			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if (grade == 5) {
//			salesCost = cost * (1-0.027);
//			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else {
//			System.out.println("1~5 까지의 grade 만 가능합니다.");
//		}

	}

}
