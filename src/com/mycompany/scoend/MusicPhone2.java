package com.mycompany.scoend;

public class MusicPhone2 extends MusicPhone {

	@Override
	void tell2() {System.out.println("오버라이드 음악전화걸기");
	}

	@Override
	void call2() {System.out.println("오버라이드 음악전화받기");
	}

	void connect2() {System.out.println("오버라이드 기지국연결");
	}

	@Override
	void battery() {System.out.println("배터리충전");
	}

	@Override
	void download() {System.out.println("음악다운");
	}

	@Override
	void musicplay() {System.out.println("음악재생");
	}
	
	

}
