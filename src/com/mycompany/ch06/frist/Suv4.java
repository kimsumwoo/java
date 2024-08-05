package com.mycompany.ch06.frist;


public class Suv4 {
	public int num(int a, int b) {
		int sum =0;
		sum = a + b;
		return sum;
	}
	public String position(String c){
		String result = "";
			switch(c){
			case "사장":
				result = "8000만원";
				break;
			case "부장":
				result = "7000만원";
				break;
			case "과장":
				result = "6000만원";
				break;
			case "대리":
				result = "5000만원";
				break;
			case "사원":
				result = "4000만원";
				break;
			case "나" :
				result = "3000만원";
				break;
				
				default :
					break;
			}
			return result;
		}

	}

