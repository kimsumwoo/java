package com.mycompany.ch06.second;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		System.out.println("car.engine: " + car.engine);
		
		Car car2 = new Car("BLACK");
		System.out.println("car2.color: " + car2.color);
		
		Car car3 = new Car(12,"로마","Red","페라리");
		System.out.println("car3.color :" + car3.color);
		
		Car car4 = new Car(4,"그렌져","Black","현대자동차");
		System.out.println("car4.name " + car4.name);
		
		car4.name = "g80";
		System.out.println("car4.name " + car4.name);

	}

}
