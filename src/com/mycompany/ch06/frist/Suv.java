package com.mycompany.ch06.frist;

public class Suv {
	
	String engintype = "디젤";
	String name = "산타페";
	String company = "현대자동차";
	String driving = "4륜";
	int maxoil = 70;
	int sum = 0;
	String position = "";

	
	
	

	
	
	void go(){
		System.out.println("전진");
	}
	void back() {
		System.out.println("후진");
	}
	void num(int a, int b) {
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
	public static int num2(int c,int d) {
		int sum = c + d;
		return sum;
	}
	
	


	public String position0(String a) {
		String result = "";
		switch (a) {
			case "사장" : 
				result ="9000만원";
				break;
			case "부장" : 
				result ="8000만원";
				break;
			case "과장" :
				result ="7000만원";
				break;
			case "대리" : 
				result ="6000만원";
				break;
			case "사원" : 
				result ="5000만원";
				break;
			case "나" : 
				result ="4000만원";
				break;
			default:
				result ="0원";
				break;
				
			
		}
		return result;
		
	}
	
		
}

	
	
		

	

	
	

	


