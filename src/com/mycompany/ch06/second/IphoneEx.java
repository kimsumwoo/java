package com.mycompany.ch06.second;

public class IphoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Iphone iphone = new Iphone();
	
	Iphone iphone2 = new Iphone("i7");
	System.out.println(iphone.cpu);
	
	Iphone iphone3 = new Iphone("i7","16기가");
	System.out.println(iphone2.cpu + iphone2.memory);
	
	Iphone iphone4 = new Iphone("i7","16기가","White");
	System.out.println(iphone3.cpu + iphone3.memory + iphone3.color);
	
	
		

	}

}
