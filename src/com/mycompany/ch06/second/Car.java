package com.mycompany.ch06.second;

public class Car {
//	field
	int engine;
	String name;
	String color;
	String company;
	
	Car(){
		
	}
	Car(String color){
		this.color = color;
	}
	
	Car (int engine, String name, String color, String comapny){
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;	
	}
//	method
	void go() {
		System.out.println("앞으로갑니다.");
	}
	void back() {
		System.out.println("뒤로갑니다.");
	}		
}


