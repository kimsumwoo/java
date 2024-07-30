package com.mycompany.ch04;

public class Switch2_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "대리";
		
		switch (position) {
		case "사장":{
			System.out.println("9000만원");
			break;
		}
		case "부장":{
			System.out.println("8000만원");
			break;
		}
		case "과장":{
			System.out.println("7000만원");
			break;
		}
		case "주임":{
			System.out.println("6000만원");
			break;
		}
		case "대리":{
			System.out.println("5000만원");
			break;
		}
		default:
			System.out.println("없음");
			break;
		
		}

	}
}
