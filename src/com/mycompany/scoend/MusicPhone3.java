package com.mycompany.scoend;

public class MusicPhone3 extends Phone2{

	void down() {System.out.println("음악다운");}
	void play() {System.out.println("음악재생");}
	@Override
	void call() {System.out.println("음악 전화걸기");
		// TODO Auto-generated method stub
	}
	@Override
	void tell() {System.out.println("음악 전화받기");
		// TODO Auto-generated method stub
	}
	@Override
	void connect() {System.out.println("음악 기지국 연결");
		// TODO Auto-generated method stub
	}
	@Override
	void battery() {System.out.println("음악 밧테리 충전");
		// TODO Auto-generated method stub
	}
	
	

	
	//-class MobilePhone : 전화걸기, 전화받기, 무선 기지국 연결, 배터리 충전하기
	//-class MusicPhone : 전화걸기, 전화받기, 무선기지국 연결, 배터리 충전하기, 음악다운받기, 음악재생하기
	//두 클래스를 생성하고 공통된 기능을 부모 클래스로 만들어 상속 관계를 형성
	//부모 클래스를 의 내용을 전부 오버라이드 진행...

	
	
	
	

}
