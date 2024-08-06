package com.mycompany.ch06.second;

public class Iphone {
	String cpu;
	String memory;
	String color;
	
	Iphone(){
		
	}
	
	Iphone(String cpu){
		this.cpu = cpu;
	}
	
	Iphone(String cpu, String memory){
			this.cpu = cpu;
			this.memory = memory;
	}
	Iphone(String cpu, String memory, String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}
	

}
