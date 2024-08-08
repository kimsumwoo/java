package com.mycompany.scoend;

public class MobilePhone2 extends MobilePhone{

	@Override
	void battery() {System.out.println("오버라이드 배터리충전");
	}

	@Override
	void tell() {System.out.println("오버라이드 전화걸기");
	}

	@Override
	void call() {System.out.println("오버라이드 전화받기");
	}

	@Override
	void connect() {System.out.println("오버라이드 기지국연결");
	}
	
	
	

}
