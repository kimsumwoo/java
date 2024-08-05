package com.mycompany.ch06.frist;

public class Suv1 {
	int sum = 0; // 리턴이 들어갈 값,결과가 들어갈 값
	
	public int num1(int a,int b){ //함수 타입,이름(함수,타입,이름,개수 설정)
	
		int sum = a + b; // 더하기
		return sum; // 값을 내보낸다
	}
	public String position(String c){
		String result = "";
		switch (c) {
			case "사장" :
				result = "9000만원";
				break;
			case "부장" :
				result = "8000만원";
				break;
			case "과장" :
				result = "7000만원";
				break;
			case "대리" :
				result = "6000만원";
				break;
			case "사원" :
				result = "5000만원";
				break;
			case "나" :
				result = "5000만원";	
				break;
			default :
				result = "0원";
				break;
	
			}
			return result;
	}
}
