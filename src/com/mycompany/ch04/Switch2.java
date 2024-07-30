package com.mycompany.ch04;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "부장";
		
		switch (position) {
		case "사장": {
			System.out.println("사장 연봉은 9000만원 입니다.");
			break;
		}
		case "부장": {
			System.out.println("부장 연봉은 8000만원 입니다.");
			break;
		}
		case "과장": {
			System.out.println("과장 연봉은 7000만원 입니다.");
			break;
		}
		case "대리": {
			System.out.println("대리 연봉은 6000만원 입니다.");
			break;
		}
		case "주임": {
			System.out.println("주임 연봉은 5000만원 입니다.");
			break;
		}
		case "사원": {
			System.out.println("사원 연봉은 4000만원 입니다.");
			break;
		}
		case "나": {
			System.out.println("나의 연봉은 3000만원 입니다.");
			break;
		}
		default:
			System.out.println("올바른 문구가 아닙니다.");
			break;
		}

	}

}
