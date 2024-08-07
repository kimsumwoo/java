package com.mycompany.ch07first;

public class Cellphone {
//	필드
	public String model;
	public String color;
	
//	생성자
	
//	메소드
	void poweron() {System.out.println("전원을 켭니다.");}
	void poweroff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendvoice(String message) {System.out.println("자기전 알람");}
	void receivevoice(String message) {System.out.println("기상 알람");}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	void poweron(int a) {System.out.println("전원을 켭니다.2");}
	
	
}
