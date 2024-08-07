package com.mycompany.ch07first;

public class DmbCellPhone extends Cellphone {
	
//	child class
	
	
//	필드
	public int channel;
	
	@Override
	void poweron() {
		System.out.println("자식의 전원을 켭니다");
	}
	//	메소드
	void turnOnDmb() {
//		power on
		System.out.println("채널" + channel +"번 Dmb");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel +"번으로 바꿉니다");
	}
	void channelOffDmb() {
		System.out.println("Dmb 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
}
